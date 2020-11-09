package com.zxr.dao;

import com.zxr.pojo.User;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.util.List;

/**
 * @Author zhaoxiangrui
 * @create 2020/11/9 11:47
 */
public interface IUserDao {

	//查询全部
	public List<User> findAll() throws Exception;

	//根据条件进行查询
	public User findByCondition(User user) throws Exception;
}
