login = (function($){

	$(document).ready(function(){
		var contextPath = getContextPath();
//		$(".logging").click(function(){
//	        $.ajax({
//	            type: 'get',
//	            url: contextPath+'/rest/login/index',
//	            async: false,
//	            data:{"userName":$("#username").val(),"password":$("#password").val()},
////	            dataType: 'jsonp',
////	            jsonp: 'callback',
//	            success: function (data) {
//	               console.log(JSON.stringify(data));
//	            },
//	            error: function (error) {
//	                console.log(error);
//	            }
//	        });
//		});	
	});
	
	function getContextPath() {

	    var pathName = document.location.pathname;
	    var index = pathName.substr(1).indexOf("/");
	    var result = pathName.substr(0,index+1);
	    return result;
	}
	
})(jQuery);
jQuery.noConflict();