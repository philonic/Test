package com.common.base;

import java.util.List;

public interface BaseDao<T> {

	T get(T t);
	List<T> findList(T t);
	int update(T t);
	int delete(T t);
}
