package com.taowd.service;

import java.util.List;

import com.taowd.pojo.User;

/**
 * 用户服务
 * 
 * @author Taowd
 *
 */
public interface UserService {

	/**
	 * 根据id查找用户信息，返回一个用户的信息
	 * 
	 * @param id
	 * @return
	 */
	User selectUserById(Integer id);

	/**
	 * 查询所有用户信息
	 * 
	 * @return
	 */
	List<User> getUserList(User user);
}
