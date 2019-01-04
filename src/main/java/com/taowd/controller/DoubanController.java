package com.taowd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taowd.pojo.Douban;
import com.taowd.service.DoubanService;

@Controller
@RequestMapping("/douban")
public class DoubanController {

	@Autowired

	private DoubanService doubanService;

	@ResponseBody
	@RequestMapping("/query")
	public List<Douban> query() {
		return doubanService.getDoubanList();
	}

}
