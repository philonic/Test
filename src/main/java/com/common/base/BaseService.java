package com.common.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("rawtypes")
public class BaseService<Dao extends BaseDao<T>,T extends BaseEntity> {

	@Autowired
	public Dao dao;
	
	public T get(T t) {
		return dao.get(t);
	}
	public List<T> findList(T t) {
		return dao.findList(t);
	}
	public int update(T t) {
		return dao.update(t);
	}
	public int delete(T t) {
		return dao.delete(t);
	}
	
	
	
}
