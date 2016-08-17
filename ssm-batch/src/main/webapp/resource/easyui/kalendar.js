
/*************    方法     **************/
	//判断是否是闰年,计算每个月的天数
	function leapYear(year){
		var isLeap = year%100==0 ? (year%400==0 ? 1 : 0) : (year%4==0 ? 1 : 0);
		return new Array(31,28+isLeap,31,30,31,30,31,31,30,31,30,31);
	}

	//获得某月第一天是周几
	function firstDay(day){
		return day.getDay();
	}

	//获得当天的相关日期变量
	function dateNoneParam(){
		var day = new Date();
		var today = new Array();
		today['year'] = day.getFullYear();
		today['month'] = day.getMonth();
		today['date'] = day.getDate();
		today['hour'] = day.getHours();
		today['minute'] = day.getMinutes();
		today['second'] = day.getSeconds();
		today['week'] = day.getDay();
		today['firstDay'] = firstDay(new Date(today['year'],today['month'],1)); 
		return today;
	}

	//生成日历代码 的方法
	//参数依次为 年 月 日 当月第一天(是星期几)
	function kalendarCode(codeYear,codeMonth,codeDay,codeFirst,monthDays){
		kalendar_html = "<table id='kalendar'><tr id='week'><td><ul><li class='weekend'>星期日</li><li>星期一</li><li>星期二</li><li>星期三</li><li>星期四</li><li>星期五</li><li class='weekend'>星期六</li></ul></td></tr><tr id='day'><td colspan=7>";

		//日 列表
		for(var m=0;m<6;m++){//日期共 4-6 行
			if(m >= Math.ceil((codeFirst+monthDays[codeMonth])/7)){//第五、六行是否隐藏				
				kalendar_html += "<ul class='dayList hide dayListHide"+m+"'>";
			}else{
				kalendar_html += "<ul class='dayList dayListHide"+m+"'>";
			}

			for(var n=0;n<7;n++){//列
				if((7*m+n) < codeFirst || (7*m+n) >= (codeFirst+monthDays[codeMonth])){//某月日历中不存在的日期
					kalendar_html += "<li></li>";
				}else{
					if((7*m+n+1-codeFirst == codeDay)&&(((7*m+n)%7 == 0) || ((7*m+n)%7 == 6))){//当天是周末
						kalendar_html += "<li class='todayWeekend'>"+(7*m+n+1-codeFirst)+"</li>";
					}else if(((7*m+n)%7 == 0) || ((7*m+n)%7 == 6)){//仅是周末
						kalendar_html += "<li class='weekend'>"+(7*m+n+1-codeFirst)+"</li>";
					}else if(7*m+n+1-codeFirst == codeDay){//仅是当天
						kalendar_html += "<li class='today'>"+(7*m+n+1-codeFirst)+"</li>";
					}else{//其他日期
						kalendar_html += "<li>"+(7*m+n+1-codeFirst)+"</li>";
					}
				}
			}
			kalendar_html += "</ul>";
		}
		kalendar_html += "</td></tr></table>";
		return kalendar_html;
	}
	
	function init() {
		//获取时间，确定日历显示内容
		var today = dateNoneParam();//当天

		/*月-日 设置*/
		var monthDays = leapYear(today['year']);//返回数组，记录每月有多少天

		kalendar_html = kalendarCode(today['year'],today['month'],today['date'],today['firstDay'],monthDays);
		return kalendar_html;
	}
	
	function dateFormat(year,month,day,fmt){ //author: meizz   
		var date = new Date(year,month,day);
		var o = {
		    "M+" : date.getMonth()+1,                 //月份   
		    "d+" : date.getDate(),                    //日   
		    "h+" : date.getHours(),                   //小时   
		    "m+" : date.getMinutes(),                 //分   
		    "s+" : date.getSeconds(),                 //秒   
		    "q+" : Math.floor((date.getMonth()+3)/3), //季度   
		    "S"  : date.getMilliseconds()             //毫秒   
		 };   
		 if(/(y+)/.test(fmt)) {
			 fmt=fmt.replace(RegExp.$1, (date.getFullYear()+"").substr(4 - RegExp.$1.length));
		 }
		 for(var k in o) {
		    if(new RegExp("("+ k +")").test(fmt)) {
		    	fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
		    }
		 }
		 return fmt;
	}
