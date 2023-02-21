package com.xworkz.BigBasket.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="big_basket_table")
public class BigBasketEntity {
	@Id
	@Column(name="b_id")
	private int id;
	@Column(name="b_name")
	private String name;
	@Column(name="b_phoneNumber")
	private long phoneNumber;
	@Column(name="b_emailAddress")
	private String emailAddress;
	@Column(name="b_password")
	private String password;
	@Column(name="b_wifeName")
	private String wifeName;
	@Column(name="b_food")
	private String food;
	@Column(name="b_area")
	private String area;
	@Column(name="b_price")
	private Double price;
	@Column(name="b_ownerName")
	private String ownerName;
	@Column(name="b_ownerWifeName")
	private String ownerWifeName;
}
