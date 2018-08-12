package com.taowd.dao;

import java.util.List;

import com.taowd.pojo.User;

/**
 * 
 * @author Taowd
 *
 */
public interface UserDao {

	/**
	 * 根据id查找用户信息，返回一个用户的信息
	 * 
	 * @param id
	 * @return
	 */
	public User selectUserById(Integer id);

	/**
	 * 查询所有用户信息
	 * 
	 * @return
	 */
	List<User> getUserList(User user);

}
