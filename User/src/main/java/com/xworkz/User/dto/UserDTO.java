package com.xworkz.User.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="blackperl_table")
public class UserDTO {
	@Column(name="c_name")
	private String name;
	@Column(name="c_email")
	private String email;
	@Column(name="c_fatherName")
	private String fatherName;
	@Column(name="c_motherName")
	private String motherName;
	@Column(name="c_age")
	private int age;
	@Column(name="c_id")
	@Id
	private int id;

}
