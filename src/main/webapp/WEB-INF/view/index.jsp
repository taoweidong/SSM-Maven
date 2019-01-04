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
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/locale/easyui-lang-zh_CN.js"></script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false" style="height: 60px; background: #B3DFDA; padding: 10px">头部布局</div>
	<div data-options="region:'west',split:true,title:'West'" style="width: 150px; padding: 10px;">west content</div>
	<div data-options="region:'south',border:false" style="height: 50px; background: #A9FACD; padding: 10px;">south region</div>
	<div data-options="region:'center',title:'Center'">

		<%-- 		<table id="dg" title="用户列表" class="easyui-datagrid" fitColumns="true" pagination="true" rownumbers="true" url="${pageContext.request.contextPath}/getUserList" fit="true">
			<thead>
				<tr>
					<th field="id" width="50">唯一标识</th>
					<th field="name" width="50">名称</th>
					<th field="age" width="50">年龄</th>
				</tr>
			</thead>
		</table> --%>

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


	</div>








</body>
</html>