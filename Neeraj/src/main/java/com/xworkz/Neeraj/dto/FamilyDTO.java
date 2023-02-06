package com.xworkz.Neeraj.dto;

import lombok.Data;

@Data
public class FamilyDTO {
	private String name;
	private String familyName;
	private String fatherName;
	private String motherName;
	private String siblingsName;
	private int totalNumOfSiblings;
	private String fatherOccuption;
	private boolean momWorks;
	private String grandMother;
	private boolean grandFatherAlive;
}
