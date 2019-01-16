// 基于准备好的dom，初始化echarts实例
var myChart = echarts.init(document.getElementById('main'));

// 显示标题，图例和空的坐标轴
myChart.setOption({
	title : {
		text : '豆瓣Top250影片数据分析',
		subtext : '优秀影片国家统计',
		x : 'left',
	},
	tooltip : {},
	legend : {
		data : [ '影片数' ]
	},
	xAxis : {
		type : 'category',
		data : [],
		show : true,
		name : '国家',
		axisLabel : { // 坐标轴标签
			show : true, // 是否显示
			inside : false, // 是否朝内
			rotate : 40, // 旋转角度
			margin : 5, // 刻度标签与轴线之间的距离
			color : 'red' // 默认取轴线的颜色
		},
	},
	yAxis : {
		type : 'value'
	},
	series : [ {
		data : [],
		type : 'bar',
		name : '影片数'

	} ]
});

$.ajax({
	url : $("#PageContext").val() + "/douban/chart2",
	type : "POST",
	async : false,
	cache : false,
	success : function(data) {
		myChart.setOption({
			xAxis : {
				data : data.xAxis
			},
			series : [ {
				data : data.series
			} ]
		});
	},
	error : function(error) {
		console.log(error);
	}
});