package com.taowd.dao;

import java.util.List;
import java.util.Map;

import com.taowd.pojo.Douban;

public interface DoubanMapper {

	List<Douban> selectAll();

	/**
	 * 按照年份统计电影信息
	 * @return 统计结果
	 */
	List<Map<String, Object>> queryYearCount();

	List<Map<String, Object>> queryCountryCount();

	List<Map<String, Object>> queryTypeCount();

}
