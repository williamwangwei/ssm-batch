$(function(){
	//输入验证
	$.extend($.fn.textbox.defaults.rules, {   
	    custName: {   
	        validator: function(value, param){   
	            return value.length > param[0] && value.length <= param[1];   
	        },   
	        message: '客户名称在1~30个字符之间!'  
	    },
	    empName: {   
	        validator: function(value, param){   
	        	 return value.length > param[0] && value.length <= param[1];  
	        },   
	        message: '客户员工名称在1~30字符之间!'  
	    },
	    deptName: {   
	        validator: function(value, param){   
	            return value.length > param[0] && value.length <= param[1];     
	        },   
	        message: '部门名称在1~30个字符之间!'  
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
	    },
	    replyContent:{
	    	validator: function(value, param){   
	            return value.length <= param[0];   
	        },   
	        message: '爱好最多输入150个字符!' 
	    }
	});	
	
	$('#empAccount').numberbox({ 
	    min:0 
	});
	
});


	

