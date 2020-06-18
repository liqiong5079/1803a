package com.liqiong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liqiong.beans.Goods;
import com.liqiong.service.GoodsService;

@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
	/*
	 * 查询所有商品
	 */
	@RequestMapping("queryAll")
	public String queryAll(Integer bid,Integer stauts,String  startPrice,String endPrice,Model model,@RequestParam(name="pageNum",defaultValue="1")Integer pageNum){
		//查询上品牌品牌
		List<Goods> list1=goodsService.queryBrandAll();
		
		model.addAttribute("list", list1);
		
		//查询所有商品
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("bid", bid);
		map.put("stauts", stauts);
		map.put("startPrice", startPrice);
		map.put("endPrice", endPrice);
		
		PageHelper.startPage(pageNum, 2);
		List<Goods> list = goodsService.queryGoodsAll(map);
		for (Goods goods : list) {
			if (goods.getStauts()==0) {
				goods.setIsStauts("否");
			}else {
				goods.setIsStauts("是");
			}
		}
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		
		model.addAttribute("page", page);
		return "list";
	}

	@RequestMapping("queryBrands")
	public String queryBrands(Model model){
		//查询上品牌品牌
		List<Goods> list=goodsService.queryBrandAll();
		
		model.addAttribute("list", list);
		return "add";
	}
	
	/*
	 * 添加商品商品
	 */
	@RequestMapping("addGoods")
	public String addGoods(Goods goods){
		Integer i=goodsService.addGoods(goods);
		if (i>0) {
			return "redirect:queryAll";
		} else {
			return "add";
		}
	}
	
	/*
	 * 回显
	 */
	@RequestMapping("queryGoodsById")
	public String queryGoodsById(Integer tid,Model model){
		Goods goods=goodsService.queryGoodsById(tid);
		//查询上品牌品牌
		List<Goods> list=goodsService.queryBrandAll();
		for (Goods li : list) {
			if (li.getBid()==goods.getBid()) {
				li.setFlag(true);
			}
		}
		model.addAttribute("list", list);
		model.addAttribute("goods", goods);
		return "update";
	}
	/*
	 * 修改商品信息
	 */
	@RequestMapping("updateGoods")
	public String updateGoods(Goods goods){
		
		Integer i=goodsService.updateGoods(goods);
		if (i>0) {
			return "redirect:queryAll";
		} else {
			return "update";
		}
	}
}
