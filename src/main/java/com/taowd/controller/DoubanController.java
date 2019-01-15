package com.taowd.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.taowd.service.DoubanService;

@Controller
@RequestMapping("/douban")
public class DoubanController {

	@Autowired

	private DoubanService doubanService;

	@ResponseBody
	@RequestMapping("/query")
	public Map<String, Object> query(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "10") Integer rows) {
		return doubanService.getDoubanList(page, rows);
	}

	@ResponseBody
	@RequestMapping(value = "/chart", method = RequestMethod.POST)
	public Map<String, Object> echartsData() {
		// 年份
		String[] categories = { "衬衫", "羊毛衫", "羽绒服", "裤子", "鞋子", "袜子" };
		// 统计结果
		int[] data = { 5, 20, 36, 10, 10, 20 };

		Map<String, Object> result = Maps.newHashMap();
		result.put("categories", categories);
		result.put("data", data);

		return doubanService.queryYearCount();
	}

}
