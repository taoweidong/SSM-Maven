package com.taowd.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
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

	@Override
	public Map<String, Object> queryYearCount() {
		Map<String, Object> result = Maps.newHashMap();
		// 年份
		List<String> categories = Lists.newArrayList();
		// 统计结果
		List<Integer> data = Lists.newArrayList();

		List<Map<String, Object>> queryResult = doubanMapper.queryYearCount();

		List<Map<String, Object>> dealData = queryResult.stream()
				.sorted(DoubanServiceImpl::comparator).collect(Collectors.toList());

		for (Map<String, Object> map : dealData) {
			categories.add(Objects.toString(map.get("yearDate")));
			data.add(Integer.parseInt(Objects.toString(map.get("counts"))));
		}

		result.put("categories", categories);
		result.put("data", data);

		return result;
	}

	public static int comparator(Map<String, Object> map1, Map<String, Object> map2) {
		if (map1 == null && map2 == null)
			return 0;

		if (map1 == null || map2 == null) {
			throw new NullPointerException();
		}

		Integer name1 = Integer.parseInt(Objects.toString(map1.get("yearDate")));
		Integer name2 = Integer.parseInt(Objects.toString(map2.get("yearDate")));

		return Integer.compare(name1, name2);
	}

}
