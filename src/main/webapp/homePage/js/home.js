var homePage = (function($) {

	$(document).ready(function() {

		var userName = GetQueryValue('userName');
		$(".userName").text(userName);
		$("#menu >ul >li.goodsItem").click(function() {
			if (!$(this).hasClass('selected')) {
				$('.goodsPage').load('goods.html');
				$(".goodsPage").css('display', 'inline-block');
			}
		});
	});

	function GetQueryValue(queryName) {
		var query = decodeURI(window.location.search.substring(1));
		var vars = query.split("&");
		for (var i = 0; i < vars.length; i++) {
			var pair = vars[i].split("=");
			if (pair[0] == queryName) {
				return pair[1];
			}
		}
		return null;
	}

	function GetQueryValue1(queryName) {
		var reg = new RegExp("(^|&)" + queryName + "=([^&]*)(&|$)", "i");
		var r = window.location.search.substr(1).match(reg);
		if (r != null) {
			return decodeURI(r[2]);
		} else {
			return null;
		}
	}

})(jQuery);
jQuery.noConflict();