package com.cloudstudio.spring.dto;

import java.io.Serializable;

public class ProductInfo implements Serializable {
	
	private int pid;
	private String name;
	
	public ProductInfo(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
