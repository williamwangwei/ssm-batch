function showWindowByUrl(text,url){
		//$('#mainFrame').attr("src",url);
	Open(text, url);
}

//���ұ�center����򿪲˵�������tab
function Open(text, url) {
	
	var str = "<iframe scrolling='yes' frameborder='0'  src="+url+" style='width:100%;height:100%;'></iframe>";
    if ($("#tabs").tabs('exists', text)) {
        $('#tabs').tabs('select', text);
    } else {
        $('#tabs').tabs('add', {
            title : text,
            closable : true,
            content : str
        });
    }
}

//�����ر��¼���ʵ��
function CloseTab(menu, type) {
    var curTabTitle = $(menu).data("tabTitle");
    var tabs = $("#tabs");
    if (type === "close") {
        tabs.tabs("close", curTabTitle);
        return;
    }
    var allTabs = tabs.tabs("tabs");
    var closeTabsTitle = [];
    $.each(allTabs, function () {
        var opt = $(this).panel("options");
        if (opt.closable && opt.title != curTabTitle && type === "Other") {
            closeTabsTitle.push(opt.title);
        } else if (opt.closable && type === "All") {
            closeTabsTitle.push(opt.title);
        }
    });
    for (var i = 0; i < closeTabsTitle.length; i++) {
        tabs.tabs("close", closeTabsTitle[i]);
    }
}