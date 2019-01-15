package com.taowd.service;

import java.util.Map;

public interface DoubanService {

	Map<String, Object> getDoubanList(Integer page, Integer rows);

	/**
	 * 按照年份统计电影信息.
	 * @return
	 */
	Map<String, Object> queryYearCount();

}
