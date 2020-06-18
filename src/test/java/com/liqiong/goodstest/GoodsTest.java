package com.liqiong.goodstest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liqiong.beans.Goods;
import com.liqiong.service.GoodsService;
import com.liqiong.service.GoodsServiceImpl;

public class GoodsTest {
	
	private static GoodsService gs;

	/*
	 * 添加测试
	 */
	@Test
	public void addGoodsTest(){
		ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
		gs=(GoodsService)cx.getBean(GoodsServiceImpl.class);
		Goods goods =new Goods(null, "华为plus", "3999", 2, "20200506", 0);
		Integer i = gs.addGoods(goods);
		System.out.println(i);
	}
	/*
	 * 回显测试
	 */
	@Test
	public void queryGoodsById(){
		ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
		gs=(GoodsService)cx.getBean(GoodsServiceImpl.class);
		
		Goods goods = gs.queryGoodsById(2);
		System.out.println(goods);
	}
	
	/*
	 * 修改测试
	 */
	@Test
	public void updateTest(){
		ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
		gs=(GoodsService)cx.getBean(GoodsServiceImpl.class);
		Goods goods =new Goods(1, "小米9", "4999", 1, "20200617", 0);
		 Integer i = gs.updateGoods(goods);
		System.out.println(i);
	}
}
