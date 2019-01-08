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
<body class="easyui-layout">
	<div data-options="region:'north',border:true" style="height: 60px; background: #B3DFDA; padding: 10px">头部布局</div>
	<div region="west" style="width: 200px; height: 500px" title="导航菜单" split="true">
		<div class="easyui-accordion">
			<div title="豆瓣图书管理" data-options="iconCls:'icon-more'">
				<a href="javascript:openTab('豆瓣图书管理' ,'douban.jsp','icon-filter')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-filter'">豆瓣图书管理</a>
			</div>
			<div title="用户信息管理" data-options="iconCls:'icon-man'">
				<a href="javascript:openTab('用户信息管理','user.jsp','icon-sum')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-sum'">用户信息管理</a>
			</div>
		</div>
	</div>
	<div data-options="region:'south',border:false" style="height: 50px; background: #A9FACD; padding: 10px;">south region</div>
	<div region="center">
		<div class="easyui-tabs" fit="true" border="false" id="tabs">
			<div title="首页">
				<div align="center" style="padding-top: 100px;">
					<font color="red" size="10">欢迎使用</font>
				</div>
			</div>
		</div>

	</div>
</body>
</html>