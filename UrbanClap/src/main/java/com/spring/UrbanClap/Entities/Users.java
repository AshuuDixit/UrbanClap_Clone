package com.spring.UrbanClap.Entities;

public class Users {
	private int user_id;
	private String user_name;
	private String user_password;
	private String phone;
	public Users() {
		super();
		
	}
	public Users(int user_id, String user_name, String user_password, String phone) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.phone = phone;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
				+ ", phone=" + phone + "]";
	}

}
