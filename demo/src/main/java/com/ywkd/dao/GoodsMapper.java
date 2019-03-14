package com.ywkd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ywkd.model.Goods;
@Repository
public interface GoodsMapper {
	List<Goods> getAllGoods();
	
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}