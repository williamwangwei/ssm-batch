$(function(){
	//输入验证
	$.extend($.fn.textbox.defaults.rules, {   
	    appointmentReason: {   
	        validator: function(value, param){   
	            return value.length <= param[0];   
	        },   
	        message: '客户名称最多30个字符!'  
	    },
	    empName: {   
	        validator: function(value, param){   
	            return value.length <= param[0];   
	        },   
	        message: '客户员工名称最多10个字符!'  
	    },
	    deptName: {   
	        validator: function(value, param){   
	            return value.length <= param[0];   
	        },   
	        message: '部门名称最多10个字符!' 
	    },
	    address: {   
	        validator: function(value, param){   
	            return value.length <= param[0];   
	        },   
	        message: '地址最多输入50个字符!' 
	    },
	    remark: {   
	        validator: function(value, param){   
	            return value.length <= param[0];   
	        },   
	        message: '备注信息最多输入50个字符!' 
	    },
	    hobbies: {   
	        validator: function(value, param){   
	            return value.length <= param[0];   
	        },   
	        message: '爱好最多输入50个字符!' 
	    }
	});	
	
	$('#empAccount').numberbox({ 
		required:true,
	    min:0 
	});
});
function validate(){
		var customerId = $("#customerId").textbox("getValue");
		if(customerId=null||customerId==""){
			$("#customerId").textbox({required:true});
		}
		var customerName = $("#customerName").textbox("getValue");
		if(customerName=null||customerName==""){
			$("#customerName").textbox({required:true});
		}
	}
function appointvalidate(){
	var appointmentType = $("#appointmentType").textbox("getValue");
		if(appointmentType=null||appointmentType==""){
			$("#appointmentType").combobox({required:true});
		}
}
function applyDatevalidate(){
	var applyDate = $("#applyDate").datebox("getValue");
		if(applyDate=null||applyDate==""){
			$("#applyDate").datebox({required:true});
		}
}



				
