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

// 基于准备好的dom，初始化echarts实例
var myChart = echarts.init(document.getElementById('main'));

// 显示标题，图例和空的坐标轴
myChart.setOption({
	title : {
		text : '豆瓣Top250影片数据分析',
		subtext : '优秀影片数年份Top10',
		x : 'left',

	},
	tooltip : {},
	legend : {
		data : [ '影片数' ]
	},
	xAxis : {
		data : [],
		show : true,
		name : '年份',
		axisLabel : { // 坐标轴标签
			show : true, // 是否显示
			inside : false, // 是否朝内
			rotate : 40, // 旋转角度
			margin : 5
		// 刻度标签与轴线之间的距离
		},
	},
	yAxis : {},
	series : [ {
		smooth : true,
		type : 'line',
		data : []
	} ]
});

$.ajax({
	url : $("#PageContext").val() + "/douban/chart",
	type : "POST",
	async : false,
	cache : false,
	success : function(data) {
		myChart.setOption({
			xAxis : {
				data : data.categories
			},
			series : [ {
				// 根据名字对应到相应的系列
				name : '影片数',
				data : data.data
			} ]
		});
	},
	error : function(error) {
		console.log(error);
	}
});
