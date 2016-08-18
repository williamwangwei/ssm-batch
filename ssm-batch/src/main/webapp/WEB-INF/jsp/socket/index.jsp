<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Socket-首页</title>

<link rel="stylesheet" type="text/css" href="<%=basePath%>resource/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>resource/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>resource/easyui/demo.css">
<script type="text/javascript" src="<%=basePath%>/resource/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<%=basePath%>resource/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>resource/easyui/jquery.easyui.min.js"></script>

<script type="text/javascript">

	$(function(){
		
		//sendMessage
		
	});
	
	function submitForm(){
		alert("send message!");
	}
</script>

</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height: 60px; background: #B3DFDA; padding: 10px">Socket
		连接</div>
	<div data-options="region:'west',split:true,title:'West'"
		style="width: 150px; padding: 10px;">west content</div>
	<div
		data-options="region:'east',split:true,collapsed:true,title:'East'"
		style="width: 100px; padding: 10px;">east region</div>
	<div data-options="region:'south',border:false"
		style="height: 50px; background: #A9FACD; padding: 10px;">south
		region</div>
	<div data-options="region:'center',title:'Center'">

		<div class="easyui-panel" title="Socket通信测试" style="width: 100%">
			<div style="padding: 10px 60px 20px 60px">
				<form id="ff" method="post">
					<table cellpadding="5">
						<tr>
							<td>IP Address:</td>
							<td><input class="easyui-textbox" type="text" name="address" data-options="required:true"></input></td>
						</tr>
						
						<tr>
							<td>PORT:</td>
							<td>
								<input class="easyui-textbox" type="text" name="port" data-options="required:true"></input>
								&nbsp;&nbsp;
								<input class="easyui-textbox" type="text" name="number" data-options="required:true"></input>
							</td>
						</tr>
						<tr>
							<td>Message:</td>
							<td><input class="easyui-textbox" name="message"
								data-options="multiline:true" style="height: 60px"></input></td>
						</tr>
						
					</table>
				</form>
				<div style="text-align: center; padding: 5px">
					<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">发送</a> 
					<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">取消</a>
				</div>
			</div>
		</div>

	</div>
</body>
</html>