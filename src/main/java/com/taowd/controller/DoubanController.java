package com.taowd.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

	/**
	 * 统计图1.
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/chart", method = RequestMethod.POST)
	public Map<String, Object> echartsData() {
		return doubanService.queryYearCount();
	}

	@ResponseBody
	@RequestMapping(value = "/chart2", method = RequestMethod.POST)
	public Map<String, Object> echartsData2() {
		return doubanService.queryCountryCount();
	}

	@ResponseBody
	@RequestMapping(value = "/chart3", method = RequestMethod.POST)
	public Map<String, Object> echartsTypeData() {
		return doubanService.queryTypeCount();
	}

}
