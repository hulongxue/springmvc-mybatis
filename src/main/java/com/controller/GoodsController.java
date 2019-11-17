package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Goods;
import com.service.IGoodsService;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Resource
	public IGoodsService goodsService;

	@RequestMapping("/getGoodsList")
	public List<Goods> getGoodsList() {
		List<Goods> goodsList = goodsService.getGoodsList();
		return goodsList;
	}

	@RequestMapping("/getGoodsDetail")
	public Goods getGoodsDetail(@RequestParam(name = "goodsId") String goodsId) {
		Goods goods = goodsService.getGoodsDetail(goodsId);
		return goods;
	}

}
