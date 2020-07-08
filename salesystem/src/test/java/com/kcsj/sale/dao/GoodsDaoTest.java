package com.kcsj.sale.dao;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kcsj.sale.BaseTest;
import com.kcsj.sale.entity.Goods;


public class GoodsDaoTest extends BaseTest {

	@Autowired
	private GoodsDao goodsDao;

	@Test
	public void testQueryById() throws Exception {
		int goodsId = 1;
		Goods good = goodsDao.queryById(goodsId);
		System.out.println(good);
	}

	@Test
	public void testQueryAll() throws Exception {
		List<Goods> goods = goodsDao.queryAll(0, 4);
		for (Goods good : goods) {
			System.out.println(good);
		}
	}

	@Test
	public void testReduceNumber() throws Exception {
		int goodsId = 3;
		int update = goodsDao.reduceNumber(goodsId);
		System.out.println("update=" + update);
	}

}
