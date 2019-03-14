package com.ywkd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ywkd.model.Goods;
import com.ywkd.service.GoodsService;


@Controller
@RequestMapping(value = "/goods")
public class GoodsController {
	private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);
	
	@Autowired
	private GoodsService  goodsService;
	
	//查询所有商品
	@RequestMapping(value = "/getAllGoods",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getAllGoods() {
		List<Goods> list=goodsService.getAllGoods();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("goods", list);
		String jsonStr=JSON.toJSONString(map);
		logger.info("=============成功查询商品=================");
		
		return jsonStr;
	}
	
	//查询一个商品
    @RequestMapping(value = "/getOneGoods",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getOneGoods(@RequestParam Integer goodId) {
        Goods goods = goodsService.selectByPrimaryKey(goodId);
       String good=JSON.toJSONString(goods);
       logger.info("===============查询一条商品成功=================");
       return good;
    }
    
    //添加商品
    @RequestMapping(value = "/addGoods",method = RequestMethod.POST)
     public void AddGoods(Goods goods) {
    	goodsService.insert(goods);
    }
    //修改商品
    @RequestMapping(value = "/editGoods",method = RequestMethod.POST)
    public void editGoods(Goods goods) {
   	    goodsService.updateByPrimaryKey(goods);
   }
    //删除商品
    @RequestMapping(value = "/deleteGoods",method = RequestMethod.GET)
    public void deleteGoods(Integer goodId) {
   	    goodsService.deleteByPrimaryKey(goodId);
   }
    
    
}
