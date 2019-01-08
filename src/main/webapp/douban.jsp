<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":"
			+ request.getServerPort() + path + "/";
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
</head>
<body>
	<table id="dg2" title="豆瓣图书信息" class="easyui-datagrid" fitColumns="true" singleSelect="true" pagination="true" rownumbers="false" url="${pageContext.request.contextPath}/douban/query" fit="true">
		<thead>
			<tr>
				<th field="serialNumber" width="10">排名</th>
				<th field="movieName" width="50">电影名称</th>
				<th field="introduce" width="50">分类</th>
				<th field="star" width="10">星级</th>
				<th field="evaluate" width="50">评论</th>
				<th field="describe" width="50">关键词</th>
			</tr>
		</thead>
	</table>
</body>
</html>

