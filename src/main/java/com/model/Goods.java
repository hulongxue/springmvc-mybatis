package com.model;

import java.util.List;

public class Goods {
	
	public int goodsId;
	
	public String goodsName;
	
	public List<String> picSrc;

	public String description;
	
	public Goods(Integer goodsId, String goodsName, String description) {
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.description = description;
	}
	
	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public List<String> getPicSrc() {
		return picSrc;
	}

	public void setPicSrc(List<String> picSrc) {
		this.picSrc = picSrc;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
