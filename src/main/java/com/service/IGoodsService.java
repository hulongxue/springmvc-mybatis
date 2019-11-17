package com.service;

import java.util.List;

import com.model.Goods;

public interface IGoodsService {
	
	public List<Goods> getGoodsList();

	public Goods getGoodsDetail(String goodsId);
}
