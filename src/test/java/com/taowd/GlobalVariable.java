package com.taowd;

import java.util.List;

import com.google.common.collect.Lists;
import com.taowd.pojo.User;

/**
 * 单元测试全局变量
 * @author Taowd
 * @version 2018年12月25日
 * @see GlobalVariable
 */
public class GlobalVariable {

	/**
	 * 获取用户列表信息.
	 * @return
	 */
	public static List<User> getUserList() {
		List<User> userList = Lists.newArrayListWithCapacity(5);
		User user = new User();
		user.setId("100120");
		user.setName("张三");
		user.setAge(25);

		User user2 = new User();
		user2.setId("100111");
		user2.setName("李四");
		user2.setAge(25);

		userList.add(user);
		userList.add(user2);

		return userList;
	}

}
