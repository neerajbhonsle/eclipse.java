package com.xworkz.Xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "alcohol_table")
@NamedQuery(name = "findByBrand", query = "select give  from NeerajEntity give where give.brand=:brands")
@NamedQuery(name = "findAll", query = "select give from NeerajEntity give")
@NamedQuery(name="findByCost",query = "select chill from NeerajEntity  chill where chill.cost=:cost")
@NamedQuery(name="findByBrandAndCost",query = "select give from NeerajEntity give where give.brand=:brands And give.cost=:cost")
public class NeerajEntity {
	@Id
	@Column(name = "n_id")
	private int id;
	@Column(name = "n_brand")
	private String brand;
	@Column(name = "n_name")
	private String name;
	@Column(name = "n_cost")
	private Double cost;
	@Column(name = "n_type")
	private String type;
	@Column(name = "n_madeIn")
	private String madeIn;

}
