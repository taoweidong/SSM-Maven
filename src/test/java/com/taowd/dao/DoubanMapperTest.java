package com.taowd.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.taowd.pojo.Douban;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application.xml" })
public class DoubanMapperTest {

	@Autowired
	private DoubanMapper doubanMapper;

	@Test
	public void selectAllTest() {

		List<Douban> resultList = doubanMapper.selectAll();

		System.out.println(JSON.toJSONString(resultList));

	}

}
