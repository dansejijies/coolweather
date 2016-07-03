package com.coolweather.app.model;

import android.R.integer;

public class Province {
	private int id;
	private String provinceName;
	private String provinceCode;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setProvinceName(String name){
		provinceName=name;
	}
	public String getProvinceName(){
		return provinceName;
	}
	public void setProvinceCode(String code){
		provinceCode=code;
	}
	public String getProvinceCode(){
		return provinceCode;
	}
}
