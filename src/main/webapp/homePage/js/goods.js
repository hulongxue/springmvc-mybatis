var goodsPage = (function($) {

	$(document).ready(function() {
		getGoodsList();
	});

	function getGoodsList() {
		var contextPath = getContextPath();
		$.ajax({
			type : 'get',
			url : contextPath + '/rest/goods/getGoodsList',
			async : false,
			data : {
				"userName" : $("#username").val(),
				"password" : $("#password").val()
			},
			success : function(data) {
				for ( var goods in data) {
					$(".goodsList").append(
							"<tr><td><a id='" + data[goods].goodsId
									+ "' href='" + contextPath
									+ "/homePage/goodsDetail.html?goodsId="
									+ data[goods].goodsId + "'  target='_blank'>"
									+ data[goods].goodsName + "</a></td><td>"
									+ data[goods].description + "</td></tr>");
				}
			},
			error : function(error) {
				console.log(error);
			}
		});
	}

	function getContextPath() {

		var pathName = document.location.pathname;
		var index = pathName.substr(1).indexOf("/");
		var result = pathName.substr(0, index + 1);
		return result;
	}
})(jQuery);
jQuery.noConflict();