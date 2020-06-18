package com.liqiong.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liqiong.beans.Goods;
import com.liqiong.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> queryGoodsAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsMapper.queryGoodsAll(map);
	}

	@Override
	public List<Goods> queryBrandAll() {
		// TODO Auto-generated method stub
		return goodsMapper.queryBrandAll();
	}

	@Override
	public Integer addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.addGoods(goods);
	}

	@Override
	public Goods queryGoodsById(Integer tid) {
		// TODO Auto-generated method stub
		return goodsMapper.queryGoodsById(tid);
	}

	@Override
	public Integer updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.updateGoods(goods);
	}
}
