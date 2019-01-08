package com.taowd.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import com.taowd.dao.DoubanMapper;
import com.taowd.pojo.Douban;
import com.taowd.service.DoubanService;

@Service
public class DoubanServiceImpl implements DoubanService {

	@Autowired
	private DoubanMapper doubanMapper;

	@Override
	public Map<String, Object> getDoubanList(Integer page, Integer rows) {
		Map<String, Object> resultMap = Maps.newHashMap();

		// 分页功能
		PageHelper.startPage(page, rows);
		List<Douban> resultList = doubanMapper.selectAll();
		PageInfo<Douban> pageInfo = new PageInfo<Douban>(resultList);

		resultMap.put("total", pageInfo.getTotal());
		resultMap.put("rows", resultList);

		return resultMap;
	}

}
