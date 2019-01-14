<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EasyUI前端框架</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>

<script type="text/javascript">
	//格式化单元格提示信息  
	function formatCellTooltip(value) {
		return "<span title='" + value + "'>" + value + "</span>";
	}
</script>

</head>
<body>
	<table id="dg2" title="豆瓣图书信息" class="easyui-datagrid" collapsible="true" fitColumns="true" fit="true" singleSelect="true" pagination="true" rownumbers="false" url="${pageContext.request.contextPath}/douban/query">
		<thead>
			<tr>
				<th data-options="field:'serialNumber',width:10,halign:'center'">排名</th>
				<th field="movieName" halign="center" formatter="formatCellTooltip" width="50">电影名称</th>
				<th field="introduce" halign="center" formatter="formatCellTooltip" width="50">分类</th>
				<th field="star" halign="center" formatter="formatCellTooltip" width="10">星级</th>
				<th field="evaluate" halign="center" formatter="formatCellTooltip" width="50">评论</th>
				<th field="describe" halign="center" formatter="formatCellTooltip" width="50">关键词</th>
			</tr>
		</thead>
	</table>
</body>
</html>

