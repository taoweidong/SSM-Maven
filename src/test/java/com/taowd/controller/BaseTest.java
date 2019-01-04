package com.taowd.controller;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 单元测试基类.
 * @author Taowd
 * @version 2018年12月26日
 * @see BaseTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration(locations = { "classpath:application.xml",
		"classpath:springmvc/spring-mvc.xml" })
@ComponentScan(basePackages = { "com.taowd.controller", "com.taowd.service" })
@Ignore // 当前类不是单元测试类，只是为单元测试Controller层提供环境处理
public class BaseTest {

	@Autowired
	private WebApplicationContext webApplicationContext;

	protected MockMvc mockMvc;

	protected MockHttpServletRequest request;

	protected MockHttpServletResponse response;

	/**
	 * 初始化SpringmvcController类测试环境.
	 */
	@Before
	public void setUp() {
		// 设置编码格式
		request = new MockHttpServletRequest();
		request.setCharacterEncoding("UTF-8");

		// 利用contextholder将被测试文件的request锁定到测试文件mock的request
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		response = new MockHttpServletResponse();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");

		// 加载web容器上线文
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

}
