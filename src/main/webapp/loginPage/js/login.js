login = (function($){
	
	$(document).ready(function(){
		$(".logging").click(function(){
			var userName = $("#username").val();
			var password = $("#password").val();
			console.log("userName:"+userName+",password:"+password);
	        $.ajax({
	            type: 'get',
	            url: 'http://localhost:8080/hu/rest/login/index',
	            async: false,
	            data:{"userName":userName,"password":password},
//	            dataType: 'jsonp',
//	            jsonp: 'callback',
	            success: function (data) {
	               console.log(JSON.stringify(data));
	            },
	            error: function (error) {
	                console.log(error);
	            }
	        });
		});	
	});
	
})(jQuery);
jQuery.noConflict();