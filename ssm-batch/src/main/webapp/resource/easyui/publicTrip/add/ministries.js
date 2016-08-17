$(function(){
	$("#ministries").datagrid(
						{   width : "100%",
							height : "100%",
							checkbox : true,
							nowrap : true,//设置为true，当数据长度超出列宽时将会自动截取。
							rownumbers : true,//设置为true将显示行数。
							fit: false,//设置为true时，选项卡的大小将铺满它所在的容器（浏览器）。
							pagination : false,//分页
							collapsible:false,
							fitColumns:true,
							striped : true, //隔行变色特性
							loadMsg : '数据正在加载,请耐心的等待...',
							method : 'get',
							url : 'publictripAction_searchMinistriesCustList.do',
							idField : 'id',
							columns : [[{field:'ck',width:50,checkbox:true},
							     		{field:'cust_name',title:'客户名称',width:"20%"},
							     		{field:'id',title:'id',hidden:true},
							     		{field:'cust_id',title:'客户编号',hidden:true},
							            {field : 'industry_classify',title : '行业分类',width :"15%",formatter:function(value,row,index){if(value=='7'){return "国家部委";}}},
						     		    {field:'business_scale',title:'业务规模',width:"15%",hidden:true},
						     		    {field:'cust_classify',title:'客户分类',width:"10%"},
						     		    {field:'telephone',title:'电话',width:"10%"},
						     		    {field:'address',title:'地址',width:"20%"},
						     		    {field:'itemid',title:'操作',width:"10%",align:'center',formatter: 
									    	function(value,row,index){ 
													return '<a href="javascript:void(0)" onclick="showCustList(\''+row.id+'\')">查看</a>';
									    	}
									    }
									]],
									onDblClickRow:function(){
										var arr = $('#ministries').datagrid('getSelections');
										$("#win").window("open");
										$("#win").panel({
											title : "查看信息"
										});
										$("#fee").attr("src","businessapplyAction_showBusiness.do?id="+ arr[0].id+ "&operateType=01");
							        },
							        onCheck:function(rowIndex, rowData){
							        	var arr = $('#ministries').datagrid('getSelections');
							        	$('#ministriesType').textbox('setValue',arr.length);
							        },
							        onUncheck:function(rowIndex, rowData){
							        	var arr = $('#ministries').datagrid('getSelections');
							        	$('#ministriesType').textbox('setValue',arr.length);
							        },
							        onCheckAll:function(rowIndex, rowData){
							        	var arr = $('#ministries').datagrid('getSelections');
							        	$('#ministriesType').textbox('setValue',arr.length);
							        },
							        onUncheckAll:function(rowIndex, rowData){
							        	var arr = $('#ministries').datagrid('getSelections');
							        	$('#ministriesType').textbox('setValue',arr.length);
							        },
							        onSelect:function(rowIndex, rowData){
							        	var arr = $('#ministries').datagrid('getSelections');
							        	$('#ministriesType').textbox('setValue',arr.length);
							        },
							        onUnselect:function(rowIndex, rowData){
							        	var arr = $('#ministries').datagrid('getSelections');
							        	$('#ministriesType').textbox('setValue',arr.length);
							        }
							        
						});
	
});