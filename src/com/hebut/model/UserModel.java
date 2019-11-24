package com.hebut.model;
/**
 * Model存放用户数据
 * Model数据在MVC中称为JavaBean
 * JavaBean的规范和目的：映射数据库的表结构，将数据库表制作一个Java对象
 * @author 阳阳
 *
 */
public class UserModel {
	private String userId;
	private String shoppingCartId;
	private String deefaultAddress;
	private String password;
	
	public UserModel(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getShoppingCartId() {
		return shoppingCartId;
	}
	public void setShoppingCartId(String shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}
	public String getDeefaultAddress() {
		return deefaultAddress;
	}
	public void setDeefaultAddress(String deefaultAddress) {
		this.deefaultAddress = deefaultAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
