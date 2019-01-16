// 基于准备好的dom，初始化echarts实例
var myChart = echarts.init(document.getElementById('main'));

// 显示标题，图例和空的坐标轴
myChart.setOption({
	title : {
		text : '豆瓣Top250影片数据分析',
		subtext : '影片类型分布',
		x : 'center'
	},
	tooltip : {
		trigger : 'item',
		formatter : "{a} <br/>{b} : {c} ({d}%)"
	},
	legend : {
		orient : 'vertical',
		left : 'left',
		data : []
	},
	series : [ {
		name : '类型数量',
		type : 'pie',
		radius : '55%',
		center : [ '50%', '60%' ],
		data : [],
		itemStyle : {
			emphasis : {
				shadowBlur : 10,
				shadowOffsetX : 0,
				shadowColor : 'rgba(0, 0, 0, 0.5)'
			}
		}
	} ]
});

$.ajax({
	url : $("#PageContext").val() + "/douban/chart3",
	type : "POST",
	async : false,
	cache : false,
	success : function(data) {
		myChart.setOption({
			legend : {
				data : data.legend
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
