package com.taowd.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.taowd.GlobalVariable;
import com.taowd.dao.UserDao;
import com.taowd.pojo.User;

/**
 * Service层单元测试.
 * @author Taowd
 * @version 2018年12月25日
 * @see UserServiceImplTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application.xml" })
public class UserServiceImplTest {

	@Mock
	private UserDao userDao;

	@InjectMocks
	private UserServiceImpl userServiceImpl;

	/**
	 * 注意此处必须增加此配置项.
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * 测试根据Id查找用户信息.
	 */
	@Test
	public void testSelectUserById() {
		// 设置参数
		User user = new User();
		user.setId("2018010203001");
		user.setName("张三");
		user.setAge(25);

		// 打桩数据
		when(userDao.selectUserById(anyInt())).thenReturn(user);

		// 方法调用
		User resultUser = userServiceImpl.selectUserById(anyInt());

		System.out.println(JSON.toJSONString(resultUser));

		// 断言结果
		assertEquals(resultUser.getName(), user.getName());

	}

	@Test
	public void testGetUserList() {
		// 设置参数
		User user = new User();
		user.setId("2018010203001");
		user.setName("张三");
		user.setAge(25);

		// 打桩数据
		when(userDao.getUserList(any())).thenReturn(GlobalVariable.getUserList());

		// 方法调用
		List<User> resultUser = userServiceImpl.getUserList(user);

		System.out.println(JSON.toJSONString(resultUser));

		// 断言结果
		assertTrue(resultUser.equals(GlobalVariable.getUserList()));
	}

}
