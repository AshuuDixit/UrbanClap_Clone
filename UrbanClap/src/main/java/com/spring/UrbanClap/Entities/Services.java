package com.spring.UrbanClap.Entities;

public class Services {
	private int service_Id;
	private String service_Name;
	private String service_Desc;
	private int service_price;
	public int getService_Id() {
		return service_Id;
	}
	public void setService_Id(int service_Id) {
		this.service_Id = service_Id;
	}
	public String getService_Name() {
		return service_Name;
	}
	public void setService_Name(String service_Name) {
		this.service_Name = service_Name;
	}
	public String getService_Desc() {
		return service_Desc;
	}
	public void setService_Desc(String service_Desc) {
		this.service_Desc = service_Desc;
	}
	public int getService_price() {
		return service_price;
	}
	public void setService_price(int service_price) {
		this.service_price = service_price;
	}
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Services(int service_Id, String service_Name, String service_Desc, int service_price) {
		super();
		this.service_Id = service_Id;
		this.service_Name = service_Name;
		this.service_Desc = service_Desc;
		this.service_price = service_price;
	}
	@Override
	public String toString() {
		return "Services [service_Id=" + service_Id + ", service_Name=" + service_Name + ", service_Desc="
				+ service_Desc + ", service_price=" + service_price + "]";
	}
	

}
