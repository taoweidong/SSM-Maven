package com.taowd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taowd.dao.DoubanMapper;
import com.taowd.pojo.Douban;
import com.taowd.service.DoubanService;

@Service
public class DoubanServiceImpl implements DoubanService {

	@Autowired
	private DoubanMapper doubanMapper;

	@Override
	public List<Douban> getDoubanList() {
		return doubanMapper.selectAll();
	}

}
