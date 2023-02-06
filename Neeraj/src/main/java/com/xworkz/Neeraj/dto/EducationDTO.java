package com.xworkz.Neeraj.dto;

import lombok.Data;

@Data
public class EducationDTO {
	private String name;
	private String schoolName;
	private int sslcMarks;
	private String highestScoredSub;
	private int highestScoredMarks;
	private String diplomaClgName;
	private int totalAvg;
	private String enggClgName;
	private double cgpa;
	private int totalNumOfBacklogs;
}
