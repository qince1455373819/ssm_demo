package com.ywkd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ywkd.dao.GoodsMapper;
import com.ywkd.model.Goods;
import com.ywkd.service.GoodsService;

@Service
public class GoodServiceImpl  implements GoodsService{

	@Autowired  GoodsMapper goodsMapper;
	public List<Goods> getAllGoods() {
		List<Goods> list=goodsMapper.getAllGoods();
		return list;
	}

	public int deleteByPrimaryKey(Integer id) {
		goodsMapper.deleteByPrimaryKey(id);
		return 0;
	}

	public int insert(Goods record) {
		goodsMapper.insert(record);
		return 0;
	}

	public int insertSelective(Goods record) {
        goodsMapper.insertSelective(record);
		return 0;
	}

	public Goods selectByPrimaryKey(Integer id) {
        Goods goods=goodsMapper.selectByPrimaryKey(id);
		return goods;
	}

	public int updateByPrimaryKeySelective(Goods record) {
        goodsMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	public int updateByPrimaryKey(Goods record) {
        goodsMapper.updateByPrimaryKey(record);
		return 0;
	}

}
