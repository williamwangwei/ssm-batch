//机构搜索 zTree/unit_tree.jsp?type=roleInfo&root=1
function unitSearch(funNum){
	if($("#changeModelSelectmenu").val() == 3){
		$("#unitTreeFrame").attr("src","zTree/unit_tree.jsp?nodeId=&nodeType=&tflag=S&funNum="+funNum);
	}else{
		$("#unitTreeFrame").attr("src","zTree/unit_tree.jsp?nodeId=10000000&nodeType=O&funNum="+funNum);
	}
	
	$('#condDiv').attr("data-options","selected:false");
    $('#resDiv').attr("data-options","selected:true");  
}


//刷新页面
function refresh(){
	window.frames['unitTreeFrame'].location.reload();
}