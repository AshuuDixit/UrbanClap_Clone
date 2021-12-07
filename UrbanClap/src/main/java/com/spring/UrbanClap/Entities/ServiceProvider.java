package com.spring.UrbanClap.Entities;

public class ServiceProvider {
	private int sp_id;
	private String sp_name;
	private String sp_password;
	private String sp_phone;
	public ServiceProvider() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceProvider(int sp_id, String sp_name, String sp_password, String sp_phone) {
		super();
		this.sp_id = sp_id;
		this.sp_name = sp_name;
		this.sp_password = sp_password;
		this.sp_phone = sp_phone;
	}
	@Override
	public String toString() {
		return "ServiceProvider [sp_id=" + sp_id + ", sp_name=" + sp_name + ", sp_password=" + sp_password
				+ ", sp_phone=" + sp_phone + "]";
	}
	public int getSp_id() {
		return sp_id;
	}
	public void setSp_id(int sp_id) {
		this.sp_id = sp_id;
	}
	public String getSp_name() {
		return sp_name;
	}
	public void setSp_name(String sp_name) {
		this.sp_name = sp_name;
	}
	public String getSp_password() {
		return sp_password;
	}
	public void setSp_password(String sp_password) {
		this.sp_password = sp_password;
	}
	public String getSp_phone() {
		return sp_phone;
	}
	public void setSp_phone(String sp_phone) {
		this.sp_phone = sp_phone;
	}
	

}
