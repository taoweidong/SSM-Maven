package com.taowd.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
