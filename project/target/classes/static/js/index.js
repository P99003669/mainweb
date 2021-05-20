$.ajax({
	
	url: "linechartdata",
	
	success: function(result){
		
	var timestamp = JSON.parse(result).timestamp;
	var heart_rate = JSON.parse(result).heart_rate;
	drawLineChart(timestamp, heart_rate);
	
	
	}	
	})	
		
	
function drawLineChart(timestamp, heart_rate){
	Highcharts.chart('container', {
	    chart: {
	        type: 'line',
	        width: 500
	    },
	    
	    title: {
	        text: 'Heart Rate'
	    },
	
	    xAxis: {
	        categories: timestamp
	    },
	    
	    tooltip: {
	        formatter: function() {
	          return '<strong>'+this.x+': </strong>'+ this.y;
	        }
	    },
	
	    series: [{
	        data: heart_rate
	    }]
	});
}

