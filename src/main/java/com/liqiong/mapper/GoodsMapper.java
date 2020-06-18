package com.liqiong.mapper;

import java.util.List;
import java.util.Map;

import com.liqiong.beans.Goods;

public interface GoodsMapper {

	public List<Goods> queryGoodsAll(Map<String, Object> map);

	public List<Goods> queryBrandAll();

	public Integer addGoods(Goods goods);

	public Goods queryGoodsById(Integer tid);

	public Integer updateGoods(Goods goods);
}
