package com.taowd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taowd.dao.UserDao;
import com.taowd.pojo.User;
import com.taowd.service.UserService;

/**
 * 用户服务的实现类
 * 
 * @author Taowd
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * 根据Id查找用户信息
	 */
	@Override
	public User selectUserById(Integer id) {
		return userDao.selectUserById(id);
	}

	/**
	 * 查询所有用户信息
	 */
	@Override
	public List<User> getUserList(User user) {
		return userDao.getUserList(user);
	}

}
