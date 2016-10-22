<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="<%=basePath%>resource/bootstrap-3.3.5-dist/favicon.ico">
<title>批处理列表</title>

<!-- 1. 加载Bootstrap层叠样式表 -->
<link href="<%=basePath%>resource/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=basePath%>resource/bootstrap-tabler/dist/bootstrap-table.css" rel="stylesheet">
<link href="<%=basePath%>resource/bootstrap-tabler/dist/bootstrap-editable.css" rel="stylesheet">


<!-- 2 jQuery库，同时加载该库必须在加载bootstrap.min.js之前 -->
<!-- <script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script> -->
<script src="<%=basePath%>resource/bootstrap-3.3.5-dist/jquery/jquery.js"></script>
<!-- 3 Include all compiled plugins (below), or include individual files as needed -->
<script src="<%=basePath%>resource/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>


<script src="<%=basePath%>resource/bootstrap-tabler/dist/bootstrap-table.js"></script>
<script src="<%=basePath%>resource/bootstrap-table-examples/assets/bootstrap-table/dist/extensions/export/bootstrap-table-export.js"></script>
<script src="<%=basePath%>resource/bootstrap-tabler/dist/locale/bootstrap-table-zh-CN.js"></script>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<script type="text/javascript">
var selections = [];

function getIdSelections() {
	var $table = $('#table');
    return $.map($table.bootstrapTable('getSelections'), function (row) {
        return row.LOWEST_PRICE;
    });
}

function operateFormatter(value, row, index) {
    return [
        '<a class="like" href="javascript:void(0)" title="Like">',
        '<i class="glyphicon glyphicon-heart"></i>',
        '</a>  ',
        '<a class="remove" href="javascript:void(0)" title="Remove">',
        '<i class="glyphicon glyphicon-remove"></i>',
        '</a>'
    ].join('');
}

function totalTextFormatter(data) {
    return 'Total';
}

function totalNameFormatter(data) {
    return data.length;
}

function totalPriceFormatter(data) {
    var total = 0;
    $.each(data, function (i, row) {
        total += +(row.price.substring(1));
    });
    return '$' + total;
}

function detailFormatter(index, row) {
    var html = [];
    $.each(row, function (key, value) {
        html.push('<p><b>' + key + ':</b> ' + value + '</p>');
    });
    return html.join('');
}

function responseHandler(res) {
    $.each(res.rows, function (i, row) {
        row.state = $.inArray(row.id, selections) !== -1;
    });
    return res;
}

function getHeight() {
    return $(window).height() - $('h1').outerHeight(true);
	
}

	$(function(){
		var $table = $('#table'),
		$viewDetail = $('#viewDetail');
		
		$viewDetail.click(function(){
			var rows = [];
			rows = $table.bootstrapTable('getSelections');
			if(rows!=null && rows.length == 1){
				window.location.href = "<%=basePath%>batch/view?jobId="+rows[0].jobId;
			}else{
				alert("请选择一条查看详细情况!");
			}
		});
		
		$('#table').bootstrapTable({
			locale:"zh-US" ,
			height: getHeight(),
		    url: '<%=basePath%>batch/list',
							search : true,
							showExport : true,
							showToggle : true,
							showRefresh : true,
							showColumns : true,
							toolbar : '#toolbar',
							pagination : true,
							pageList : '[10, 25, 50, 100, ALL]',
							showFooter : false,
							showPaginationSwitch : true,
							idField : 'id',
							detailView : true,
							detailFormatter : 'detailFormatter',
							sidePagination : 'server',
							responseHandler : 'responseHandler',
							columns : [
						           [
				                    {
				                        field: 'state',
				                        checkbox: true,
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle'
				                    }, {
				                        title: '工作编号',
				                        field: 'jobId',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                    }, {
				                        title: '工作名称',
				                        field: 'jobName',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                    }, {
				                        title: '工作方法',
				                        field: 'proName',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:true
				                    }, {
				                        title: '操作标志',
				                        field: 'manualFlag',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:true
				                    }, {
				                        title: '创建时间',
				                        field: 'createDate',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:true
				                    }, {
				                        title: '创建者',
				                        field: 'createUser',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:true
				                    }, {
				                        title: '输入时间',
				                        field: 'inputDate',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:true
				                    }, {
				                        title: '柜员编号',
				                        field: 'tellerId',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:true
				                    }, {
				                        title: '操作',
				                        field: 'action',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: false,
				                        visible:true,
				                        formatter:actionFormatter,
				                        events:actionEvents
				                    }
				                ]
							]
						});

	});

	function actionFormatter(value, row, index) {
        return [
            '<a class="like" href="javascript:void(0)" title="Like">',
            '<i class="glyphicon glyphicon-plus"></i>',
            '</a>',
            '<a class="edit ml10" href="javascript:void(0)" title="Edit">',
            '<i class="glyphicon glyphicon-edit"></i>',
            '</a>',
            '<a class="remove ml10" href="javascript:void(0)" title="Remove">',
            '<i class="glyphicon glyphicon-remove"></i>',
            '</a>'
        ].join('');
    }
	
	window.actionEvents = {
    	    'click .like': function (e, value, row, index) {
    	    	var url = "<%=basePath%>/batch/add";
				forward(url);
    	    },
    	    'click .edit': function (e, value, row, index) {
    	    	alert(row.jobId);
    	    	var url = "<%=basePath%>/batch/update?jobId="+row.jobId;
				forward(url);
    	    },
    	    'click .remove': function (e, value, row, index) {
    	    	var $table = $('#table');
    	    	var selections = [];
    	    	$.post(
						"<%=basePath%>batch/deleteBatchJobDefine",
						{jobId : row.jobId},
						function(result) {
							if(result.flag == 1){
								$table.bootstrapTable('remove', {
				                    field: 'jobId',
				                    values: selections
				                });
							}else{
								alert("删除失败！");
							}
						}
				);
    	    	
    	    }
    	};
	//完成js跳转
	function forward(url){
		window.location.href=url;
	}
	
	window.operateEvents = {
		'click .like' : function(e, value, row, index) {
			alert('You click like action, row: ' + JSON.stringify(row));
		},
		'click .remove' : function(e, value, row, index) {
			$table = $("#table");
			$table.bootstrapTable('remove', {
				field : 'id',
				values : [ row.id ]
			});
		}
	};
	
	$(function(){
		
		$("#home").click(function(){
			
			alert("家   家 --------");
		});
		
	});
</script>
</head>

<body>

	<div class="container">
		
		<!-- <ul class="nav nav-tabs" role="tablist">
		  <li role="presentation" class="active"><a href="javascript:return false;" id="home">Home</a></li>
		  <li role="presentation"><a href="javascript:return false;" id="profile">Profile</a></li>
		  <li role="presentation"><a href="javascript:return false;" id="messages">Messages</a></li>
		</ul> -->
		
		    <!-- 一个页面  多个叶签
		    <div class="tabbable">  
		        <ul class="nav nav-tabs nav-justified" role="tablist">  
		            <li class="active"><a href="#1" data-toggle="tab">任务列表</a></li>  
		            <li><a href="#tt" data-toggle="tab">新增任务</a></li>  
		            <li><a href="#3" data-toggle="tab">查看详情</a></li>  
		        </ul>  
		        <div class="tab-content">  
		            <div class="tab-pane active" id="1">  
		           			任务列表
		            </div>  
		            <div id="tt" class="tab-pane">  
		                	新增任务  
		            </div>  
		            <div id="3" class="tab-pane">  
		                	查看详情
		            </div>  
		        </div>  
		    </div> -->  
		    
		    <ul class="nav nav-tabs nav-justified" role="tablist">  
		            <li class="active"><a href="<%=basePath%>/batch/index">任务列表</a></li>  
		            <li><a href="<%=basePath%>/batch/add">新增任务</a></li>  
		            <li><a href="<%=basePath%>/batch/view">任务详情</a></li>  
		        </ul>  
		    <div id="toolbar">
				<button id="viewDetail" class="btn btn-success" >
					<i class="glyphicon glyphicon-flag"></i>查看详情
				</button>
			</div>
			<table id="table"></table>
		
	</div>


</body>
</html>
