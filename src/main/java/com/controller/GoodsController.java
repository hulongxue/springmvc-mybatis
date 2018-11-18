package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Goods;

@RestController
@RequestMapping("/goods")
public class GoodsController {
	
	@RequestMapping("/getGoodsList")
	public List<Goods> getGoodsList(){
		Goods goods1 = new Goods("1", "book1", "tale book");
		Goods goods2 = new Goods("1", "book2", "tale book");
		List<Goods> list = new ArrayList<Goods>(8);
		list.add(goods1);
		list.add(goods2);
		return list;
	}


}
