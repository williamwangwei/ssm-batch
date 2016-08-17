function getTotalId(){
		var arr1 = $('#bank').datagrid('getSelections');
		var id = "";
		var id1 = "";
		for ( var i = 0; i < arr1.length; i++) {
			id1 = id1+ arr1[i].id+ ",";
		}
		var arr2 = $('#exchange').datagrid('getSelections');
		var id2 = "";
		for ( var i = 0; i < arr2.length; i++) {
			id2 = id2+ arr2[i].id+ ",";
		}
		var arr3 = $('#insurance').datagrid('getSelections');
		var id3 = "";
		for ( var i = 0; i < arr3.length; i++) {
			id3 = id3+ arr3[i].id+ ",";
		}
		var arr4 = $('#fund').datagrid('getSelections');
		var id4 = "";
		for ( var i = 0; i < arr4.length; i++) {
			id4 = id4+ arr4[i].id+ ",";
		}
		var arr5 = $('#futures').datagrid('getSelections');
		var id5 = "";
		for ( var i = 0; i < arr5.length; i++) {
			id5 = id5+ arr5[i].id+ ",";
		}
		var arr6 = $('#bond').datagrid('getSelections');
		var id6 = "";
		for ( var i = 0; i < arr6.length; i++) {
			id6 = id6+ arr6[i].id+ ",";
		}
		var arr7 = $('#ministries').datagrid('getSelections');
		var id7 = "";
		for ( var i = 0; i < arr7.length; i++) {
			id7 = id7+ arr7[i].id+ ",";
		}
		var arr8 = $('#government').datagrid('getSelections');
		var id8 = "";
		for ( var i = 0; i < arr8.length; i++) {
			id8 = id8+ arr8[i].id+ ",";
		}
		var arr9 = $('#institution').datagrid('getSelections');
		var id9 = "";
		for ( var i = 0; i < arr9.length; i++) {
			id9 = id9+ arr9[i].id+ ",";
		}
		var arr10 = $('#trust').datagrid('getSelections');
		var id10 = "";
		for ( var i = 0; i < arr10.length; i++) {
			id10 = id10+ arr10[i].id+ ",";
		}
		var arr11 = $('#finance').datagrid('getSelections');
		var id11 = "";
		for ( var i = 0; i < arr11.length; i++) {
			id11 = id11+ arr11[i].id+ ",";
		}
		var arr12 = $('#lease').datagrid('getSelections');
		var id12 = "";
		for ( var i = 0; i < arr12.length; i++) {
			id12 = id12+ arr12[i].id+ ",";
		}
		var arr13 = $('#carfinance').datagrid('getSelections');
		var id13 = "";
		for ( var i = 0; i < arr13.length; i++) {
			id13 = id13+ arr13[i].id+ ",";
		}
		id = id1+id2+id3+id4+id5+id6+id7+id8+id9+id10+id11+id12+id13;
		id = id.substring(0,id.length - 1);
		var totalnumber = arr1.length+arr2.length+arr3.length+arr4.length+arr5.length+arr6.length+arr7.length+arr8.length+arr9.length+arr10.length+arr11.length+arr12.length+arr13.length;
		$("#totalCustomer").val(id); 
		$("#totalNumber").val(totalnumber); 
	
}