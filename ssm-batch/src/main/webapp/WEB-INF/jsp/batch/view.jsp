<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
：<%@ page isELIgnored="false"%>。
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
<link rel="icon"
	href="<%=basePath%>resource/bootstrap-3.3.5-dist/favicon.ico">
<title>批处理列表</title>

<!-- 1. 加载Bootstrap层叠样式表 -->
<link href="<%=basePath%>resource/bootstrap-table-examples/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=basePath%>resource/bootstrap-table-examples/assets/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet">
<%-- <link href="<%=basePath%>resource/bootstrap-tabler/dist/bootstrap-editable.css" rel="stylesheet"> --%>
<!-- 添加验证css -->
<link rel="stylesheet" href="<%=basePath%>resource/bootstrapvalidator/dist/css/bootstrapValidator.min.css"/>


<!-- 2 jQuery库，同时加载该库必须在加载bootstrap.min.js之前 -->
<!-- <script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script> -->
<script src="<%=basePath%>resource/bootstrap-table-examples/assets/jquery.min.js"></script>
<!-- 3 Include all compiled plugins (below), or include individual files as needed -->
<script src="<%=basePath%>resource/bootstrap-table-examples/assets/bootstrap/js/bootstrap.min.js"></script>
<!-- 添加验证JS -->
<script type="text/javascript" src="<%=basePath%>resource/bootstrapvalidator/dist/js/bootstrapValidator.min.js"></script>



<script src="<%=basePath%>resource/bootstrap-tabler/dist/bootstrap-table.min.js"></script>
<script src="<%=basePath%>resource/bootstrap-table-examples/assets/bootstrap-table/dist/extensions/export/bootstrap-table-export.js"></script>
<script src="<%=basePath%>resource/bootstrap-table-examples/assets/bootstrap-table/dist/locale/bootstrap-table-zh-CN.js"></script>

<!--[if lt IE 9]><script src="../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="<%=basePath%>resource/bootstrap-table-examples/assets/bootstrap-table/dist/ie-emulation-modes-warning.js"></script>

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="<%=basePath%>resource/bootstrap-table-examples/assets/bootstrap-table/dist/ie10-viewport-bug-workaround.js"></script>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<script type="text/javascript">
	//完成js跳转
	function forward(url) {
		window.location.href = url;
	}


	$(function() {
		$('#form1').bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
            	proName: {
                    message: 'The proName is not valid',
                    validators: {
                        notEmpty: {
                            message: 'The proName is required and can\'t be empty'
                        },
                        stringLength: {
                            min: 6,
                            max: 30,
                            message: 'The proName must be more than 6 and less than 30 characters long'
                        },
                        /*remote: {
                            url: 'remote.php',
                            message: 'The username is not available'
                        },*/
                        regexp: {
                            regexp: /^[a-zA-Z0-9_\.]+$/,
                            message: 'The proName can only consist of alphabetical, number, dot and underscore'
                        }
                    }
                },
                jobDetail: {
                    validators: {
                        notEmpty: {
                            message: 'The jobDetail address is required and can\'t be empty'
                        },
                        emailAddress: {
                            message: 'The jobDetail is not a valid email address'
                        }
                    }
                }
            }
        }).on('success.form.bv', function(e) {
            // Prevent form submission
            e.preventDefault();

            // Get the form instance
            var $form = $(e.target);
            
            // Get the BootstrapValidator instance
            var bv = $form.data('bootstrapValidator');

            // Use Ajax to submit form data
            $.post($form.attr('action'), $form.serialize(), function(result) {
                console.log(result);
            }, 'json');
        });
		
		$("#save").click(function(){
			
			<%-- var formParam = $("#form1").serialize();//序列化表格内容为字符串  
			alert(formParam);
		     $.ajax({  
		         type:'post',      
		        url:'<%=basePath%>batch/addBatchJobDefine',  
		         data:formParam,  
		         cache:false,  
		         dataType:'json',  
		         success:function(data){  
		        	 alert(data.batchJobDefine);
		         }  
		     }); --%>
		     $('#form1').submit();
		     
			
			return false; 
		});
		
		$("#popTitle").click(function(){
			
			$('#myModal').modal({
			    backdrop:true,
			    keyboard:true,
			    show:true
			});
			return false; 
		});
		
		$("#display").click(function(){
			
			$("#alert-user").attr("class","alert alert-danger"); 
			
			return false; 
		});
	});
</script>
</head>

<body>

	<div class="container">

		<ul class="nav nav-tabs nav-justified" role="tablist">
			<li><a href="<%=basePath%>/batch/index">任务列表</a></li>
			<li><a href="<%=basePath%>/batch/add">新增任务</a></li>
			<li class="active"><a href="<%=basePath%>/batch/view">任务详情</a></li>
		</ul>
		<div id="toolbar">

			<button id="back" class="btn btn-success" onclick="history.go(-1)">
				<i class="glyphicon glyphicon-arrow-left"></i> 回退
			</button>

			<button id="remove" class="btn btn-success">
				<i class="glyphicon glyphicon-flag"></i> 测试ODM
			</button>

			<button id="save" class="btn btn-success">
				<i class="glyphicon glyphicon-flag"></i> 保存
			</button>
			
			<button id="popTitle" class="btn btn-success">
				<i class="glyphicon glyphicon-flag"></i> 模态对话框JS
			</button>
			<button id="display" class="btn btn-success">
				<i class="glyphicon glyphicon-flag"></i> 显示提示信息
			</button>
			
			<!-- Button trigger modal -->
			<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
			  	<i class="glyphicon glyphicon-flag"></i>模态对话框
			</button>
		
		</div>

		<div>

			<div class="row">
				<form role="form" id="form1" action="<%=basePath%>batch/addBatchJobDefine" method="post">
					<div class="col-md-6">

						<div class="form-group">
							<label for="jobId">jobId</label> 
							<input type="text" class="form-control" id="jobId" name="jobId" value="${batchJobDefine.jobId}" placeholder="Enter jobId">
							<!-- <span class="glyphicon glyphicon-ok form-control-feedback"></span> -->
						</div>
						<div class="form-group">
							<label for="proName">proName</label> 
							<input type="text" class="form-control" id="proName" name="proName" value=${batchJobDefine.proName } placeholder="Enter proName">
						</div>
						<div class="form-group">
							<label for="profileFlag">text profileFlag</label> 
							<input type="text" class="form-control" id="profileFlag" name="profileFlag" value="${batchJobDefine.profileFlag }" placeholder="Enter profileFlag">
						</div>
						<div class="form-group">
							<label for="profileId">profileId</label> 
							<input type="text" class="form-control" id="profileId" name="profileId" value="${batchJobDefine.profileId }" placeholder="profileId">
						</div>
						<div class="form-group">
							<label for="manualFlag">text manualFlag</label> 
							<input type="text" class="form-control" id="manualFlag" name="manualFlag" value="${batchJobDefine.manualFlag }" placeholder="Enter manualFlag">
						</div>
						<div class="form-group">
							<label for="jobDetail">jobDetail</label> 
							<input type="text" class="form-control" id="jobDetail" name="jobDetail" value="${batchJobDefine.jobDetail }" placeholder="Enter jobDetail">
						</div>



					</div>
					<div class="col-md-6">
						<div class="form-group">
							<label for="jobName">jobName</label> 
							<input type="text" class="form-control" id="jobName" name="jobName" value="${batchJobDefine.jobName }" placeholder="Enter jobName">
						</div>
						<div class="form-group">
							<label for="createDate">createDate</label> 
							<input type="date" class="form-control" id="createDate" name="createDate" value="${batchJobDefine.createDate }" placeholder="createDate">
						</div>
						<div class="form-group">
							<label for="createUser">text createUser</label> 
							<input type="text" class="form-control" id="createUser" name="createUser" value="${batchJobDefine.createUser }" placeholder="Enter createUser">
						</div>
						<div class="form-group">
							<label for="inputDate">inputDate</label> 
							<input type="date" class="form-control" id="inputDate" name="inputDate" value="${batchJobDefine.inputDate }" placeholder="inputDate">
						</div>
						<div class="form-group">
							<label for="tellerId">text tellerId</label> 
							<input type="text" class="form-control" id="tellerId" name="tellerId" value="${batchJobDefine.tellerId }" placeholder="Enter tellerId">
						</div>
						<div class="form-group">
							<label for="id">id</label> 
							<input type="text" class="form-control" id="id" name="id" value="${batchJobDefine.id }" placeholder="id" >
						</div>
					</div>
				</form>
			</div>

		</div>


		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
		        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
		      </div>
		      <div class="modal-body">
		        ...
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		        <button type="button" class="btn btn-primary">Save changes</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		
		<div id="alert-user" class="alert alert-danger hidden" role="alert">
			<button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
		    <strong>错误：</strong>请输入您的用户名！
		</div>
		
		<div id="alertTest" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		    <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		        <h3 id="myModalLabel">提示标题</h3>
		    </div>
		    <div class="modal-body">
		        <p>提示内容！</p>
		    </div>
		    <div class="modal-footer">
		        <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
		    </div>
		</div>
				
	</div>


</body>
</html>
