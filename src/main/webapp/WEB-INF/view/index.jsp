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

<link rel="shortcut icon" href="#" />

</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:true" style="height: 60px; background: #B3DFDA; padding: 10px">头部布局</div>
	<div region="west" style="width: 200px; height: 500px" title="导航菜单" split="true">
		<div class="easyui-accordion" split="true">
			<div title="豆瓣图书管理" data-options="iconCls:'icon-more'">
				<a href="javascript:openTab('豆瓣图书管理' ,'douban.jsp','icon-filter')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-filter'">豆瓣图书管理</a>
			</div>
			<div title="用户信息管理" data-options="iconCls:'icon-man'">
				<a href="javascript:openTab('用户信息管理','user.jsp','icon-sum')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-sum'">用户信息管理</a>
			</div>
		</div>
	</div>
	<div data-options="region:'south',border:false" style="height: 20px; text-align: center; background: #A9FACD;">
		© 2018 <a href="http://www.taoweidong.com" target="_blank">半度微凉</a> 琼ICP备17002905号-1
	</div>
	<div region="center">
		<div class="easyui-tabs" fit="true" border="false" id="tabs">
			<div title="首页">
				<div align="center" style="padding-top: 100px;">
					<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
					<div id="main" style="width: 600px; height: 400px;"></div>
				</div>
			</div>
		</div>

	</div>
	<input id="PageContext" type="hidden" value="${pageContext.request.contextPath}" />
</body>
<!--注意：一般js文件放在body后面进行加载  -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/locale/easyui-lang-zh_CN.js"></script>
<!-- 引入 ECharts 文件 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>

</html>