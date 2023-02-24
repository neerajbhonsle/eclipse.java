package com.xworkz.festival.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Entity
@Data
@Table(name = "fest_table")
@NamedQuery(name="findByIdAndName", query = "select none from FestivalEntity none where none.name=:name and none.id=:id")
@NamedQuery(name="findByNameAndRegionAndMainGod",query = "select ant.name,ant.region from FestivalEntity ant where ant.mainGod=:god ")
@NamedQuery(name="findByMainGod" ,query = "select aqu from FestivalEntity aqu where aqu.mainGod=:god")
@NamedQuery(name="findTotalDaysByName",query = "select iron.totalDays from FestivalEntity iron where iron.name=:name")
@NamedQuery(name="findRegionAndMainGodByNameAndId",query = "select uri.region,uri.mainGod from FestivalEntity uri where uri.name=:name and uri.id=:id ")
@NamedQuery(name="findMainGodAndTotalDaysByName",query = "select batman.mainGod,batman.totalDays from FestivalEntity batman where batman.name=:name")
@NamedQuery(name = "findTotal",query = "select sum (spider) from FestivalEntity spider")
@NamedQuery(name="findMaxTotalDays",query = "select max(roll.totalDays)from FestivalEntity roll")
public class FestivalEntity {
	@Id
	@Column(name = "f_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_region")
	private String region;
	@Column(name = "f_total_Days")
	private int totalDays;
	@Column(name = "f_sweet")
	private String sweet;
	@Column(name = "f_main_God")
	private String mainGod;

	public FestivalEntity(String name, String region, int totalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}

}
