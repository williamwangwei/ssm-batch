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
<title>产品列表</title>

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
		$remove = $('#remove');
		
		$remove.click(function(){
			alert("123");
			var rows = [];
			rows = $table.bootstrapTable('getSelections');
			if(rows!=null && rows.length == 1){
				$.post("<%=basePath%>product/adminProductAction_testCloudLoanProduct",
						{lowestPrice : rows[0].LOWEST_PRICE},
						function(result) {
							alert(result);
						}
				);
			}else{
				alert("请选择一条产品测试");
			}
		});
		
		$('#table').bootstrapTable({
			locale:"zh-US" ,
			height: getHeight(),
		    url: '<%=basePath%>product/adminProductAction_productList',
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
				                        title: '产品编号',
				                        field: 'product_id',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                    }, {
				                        title: '产品名称',
				                        field: 'PRODUCT_NAME',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                    }, {
				                        title: '成本价',
				                        field: 'LOWEST_PRICE',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:false
				                    }, {
				                        title: '成本价单位',
				                        field: 'LOWEST_PRICE_unit',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:false
				                    }, {
				                        title: '产品价格',
				                        field: 'PRODUCT_PRICE',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:false
				                    }, {
				                        title: '产品价格单位',
				                        field: 'product_price_unit',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:false
				                    }, {
				                        title: '产品方向',
				                        field: 'PRODUCT_DIRECTION',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:false
				                    }, {
				                        title: '描述',
				                        field: 'DESCRIPTION',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:false
				                    }, {
				                        title: '创建日期',
				                        field: 'INPUT_DATE',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: true,
				                        visible:false
				                    }, {
				                        title: '操作',
				                        field: 'action',
				                        rowspan: 1,
				                        align: 'center',
				                        valign: 'middle',
				                        sortable: false,
				                        visible:false,
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
    	    	addProductInfo();
    	    },
    	    'click .edit': function (e, value, row, index) {
    	    	var url = "${pageContext.request.contextPath}/sys/productAction_showProduct.do?productId="+row.product_id+"&operateType=02";
				forward(url);
    	    },
    	    'click .remove': function (e, value, row, index) {
    	    	var $table = $('#exampleTableEvents');
    	    	var selections = [];
    	    	selections[0] = row.product_id;
    	    	$table.bootstrapTable('remove', {
                    field: 'product_id',
                    values: selections
                });
    	    }
    	};
	
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
</script>
</head>

<body>

	<div class="container">
		<div id="toolbar">
			<button id="remove" class="btn btn-success" >
				<i class="glyphicon glyphicon-flag"></i> 测试ODM
			</button>
		</div>
		<table id="table"></table>
	</div>


</body>
</html>
