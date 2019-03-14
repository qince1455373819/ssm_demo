package com.ywkd.service;

import java.util.List;

import com.ywkd.model.Goods;

public interface GoodsService {
	List<Goods> getAllGoods();
	
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record) ;

    int updateByPrimaryKey(Goods record);
}
