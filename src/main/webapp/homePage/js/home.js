home = (function($){

	$(document).ready(function(){
		$("#menu >ul >li.goodsItem").click(function(){
			if(!$(this).hasClass('selected')){
	            $("#menu >ul >li").removeClass('selected');
	            $(this).addClass('selected');
	            getGoodsList();
	        }
		});
	});
	
	function getGoodsList(){
		var contextPath = getContextPath();
		 $.ajax({
            type: 'get',
            url: contextPath+'/rest/goods/getGoodsList',
            async: false,
            data:{"userName":$("#username").val(),"password":$("#password").val()},
            success: function (data) {
               for(var goods in data){
            	  $(".goodsList").append("<tr><td>"+data[goods].goodsName+"</td><td>"+data[goods].description+"</td></tr>");
               }
               $(".goods").css('display', 'inline-block');
            },
            error: function (error) {
                console.log(error);
            }
        });
	}
	
	function getContextPath() {

	    var pathName = document.location.pathname;
	    var index = pathName.substr(1).indexOf("/");
	    var result = pathName.substr(0,index+1);
	    return result;
	}
})(jQuery);
jQuery.noConflict();