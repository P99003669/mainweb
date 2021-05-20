$.ajax({
	
	url: "oxycharts",
	
	success: function(result){
		
	var timestamp = JSON.parse(result).timestamp;
	var oxygen_level = JSON.parse(result).oxygen_level;
	drawLineChart(timestamp, oxygen_level);
	
	
	}	
	})	
		
	
function drawLineChart(timestamp, oxygen_level){
	Highcharts.chart('container', {
	    chart: {
	        type: 'line',
	        width: 500
	    },
	    
	    title: {
	        text: 'Oxygen_Level'
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
	        data: oxygen_level
	    }]
	});
}

