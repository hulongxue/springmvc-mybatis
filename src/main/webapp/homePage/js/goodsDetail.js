var goodsDetailPage = (function($) {

	$(document).ready(function() {
		var goodsId = getQueryString('goodsId');
		console.log('%o',goodsIds);
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
				console.log(JSON.stringify(datas));
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
	
	function getQueryString(name) {
		var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
		var r = window.location.search.substr(1).match(reg);
		if (r != null) {
			return unescape(r[2]);
		}
		return null;
	}
})(jQuery);
jQuery.noConflict();