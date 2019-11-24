package com.hebut.dao;

import com.hebut.model.UserModel;
/**
 * 完成对用户数据的操作
 * @author 阳阳
 *
 */
public interface UserDao {

	/**用户登录的方法
	 * @param user 包含 username 和 password
	 * @return int类型 -1 登录失败 ，1 管理员登录 ，2 学生登录
	 */
	int login(String userId,String password);
	
	/**添加用户的方法
	 * @param user
	 * @return 布尔型 true 表示添加成功 false 表示添加失败
	 */
	boolean insert(UserModel user);
	
	/**删除用户的方法
	 * @param username
	 * @return 布尔型 true 表示删除成功 false 表示删除失败
	 */
	boolean delete(String userId);
	
	/**更改用户信息的方法
	 * @param user
	 * @return 布尔型 true 表示更改成功 false 表示更改失败
	 */
	boolean update(UserModel user);
	
	/**
	 * @param username
	 * @return User类型 
	 */
	UserModel select(String userId);
}
