package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.GoodsDaoMapper;
import com.model.Goods;

@Service
public class GoodsService implements IGoodsService{
	
	@Resource
	private GoodsDaoMapper goodsDaoMapper;

	public List<Goods> getGoodsList() {
		List<Goods> goodsList = goodsDaoMapper.getGoodsList();
		return goodsList;
	}

	public Goods getGoodsDetail(String goodsId) {
		Goods goods = goodsDaoMapper.getGoodsDetail(goodsId);
		return goods;
	}

}
