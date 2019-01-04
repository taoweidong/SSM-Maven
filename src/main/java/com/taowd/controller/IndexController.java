package com.taowd.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.taowd.pojo.User;
import com.taowd.service.UserService;

/**
 * @author Taowd
 */
@Controller
public class IndexController {

	@Resource
	private UserService userService;

	@RequestMapping("/")
	public ModelAndView index() {
		// System.out.println("进入主页--------->");
		// 创建一个视图对象
		ModelAndView mav = new ModelAndView("index");
		User user = userService.selectUserById(3);
		mav.addObject("user", user);

		return mav;
	}

	/**
	 * 查询所有学生信息 返回JSON格式的数据
	 * @return
	 */
	@RequestMapping(value = "/getList", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getUserList() {
		User user = new User();

		return userService.getUserList(user);

	}

	/**
	 * 查询所有学生信息 返回JSON格式的数据
	 * @return
	 */
	@RequestMapping(value = "/getUserList", method = RequestMethod.POST)
	@ResponseBody
	public List<User> userList() {
		User user = new User();

		return userService.getUserList(user);
	}

	@RequestMapping(value = "/postTest/{name}", method = RequestMethod.POST)
	@ResponseBody
	public String postTest(@PathVariable String name) {

		System.out.println("获取到的参数为：" + name);

		HashMap<String, String> result = new HashMap<String, String>();
		result.put("success", "成功，获取数据为：" + name);

		return JSON.toJSONString(result);
	}

}
