package com.dao;

import java.util.List;

import com.model.Goods;

public interface GoodsDaoMapper {

	List<Goods> getGoodsList();

	Goods getGoodsDetail(String goodsId);
	
}
