package com.xworkz.First.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {

	@Autowired
	@Qualifier("num")
	private int id;
	@Autowired
	@Qualifier("hesaru")
	private String name;
	@Autowired
	@Qualifier("gst")
	private double gstNo;
	@Autowired
	@Qualifier("onwerHesaru")
	private String ownerName;
	@Autowired
	@Qualifier("location")
	private String address;

	public HardwareShop() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

}
