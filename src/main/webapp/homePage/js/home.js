var homePage = (function($){

	$(document).ready(function(){
		$("#menu >ul >li.goodsItem").click(function(){
			if(!$(this).hasClass('selected')){
				$('.goodsPage').load('goods.html');
				$(".goodsPage").css('display', 'inline-block');
	        }
		});
	});
	
})(jQuery);
jQuery.noConflict();