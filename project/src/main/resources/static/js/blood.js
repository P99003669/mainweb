$.ajax({
	
	url: "bloodcharts",
	
	success: function(result){
		
	var timestamp = JSON.parse(result).timestamp;
	var blood_pressure = JSON.parse(result).blood_pressure;
	drawLineChart(timestamp, blood_pressure);
	
	
	}	
	})	
		
	
function drawLineChart(timestamp, blood_pressure){
	Highcharts.chart('container', {
	    chart: {
	        type: 'line',
	        width: 1000
	    },
	    
	    title: {
	        text: 'Blood Pressure'
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
	        data: blood_pressure
	    }]
	});
}

