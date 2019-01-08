//点击左侧属性菜单中的某一项时，触发此事件，在右侧区域打开响应的页面
function openTab(text, url, iconCls) {
	if ($("#tabs").tabs("exists", text)) {
		$("#tabs").tabs("close", text);
		addTab(url, text, iconCls);
		$("#tabs").tabs("select", text);
	} else {
		addTab(url, text, iconCls);
	}
}

function addTab(url, text, iconCls) {
	var content = "<iframe frameborder=0 scrolling='auto' style='width:100%;height:100%' src='"
			+ url + "'></iframe>";
	$("#tabs").tabs("add", {
		title : text,
		iconCls : iconCls,
		closable : true,
		content : content
	});
}