package com.xworkz.CRUD.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class TerroristDTO extends AbstractAduitDTO {
	@NonNull
	@NotNull(message = "Terrorist name cannot be null")
	@Size(min = 3, max = 20, message = "name is invalid,should be more than 3 or max 20")
	private String name;
	@NonNull
	@Min(value = 1, message = "age should be greater than 1 or less than 150")
	@Max(value = 150, message = "age should be greater than 1 or less than 150")
	private int age;
	@NonNull
	@NotNull(message = "country name cannot be null")
	@Size(min = 3, max = 25, message = "Country name is invalid,should be more than 3 or max 25")
	private String country;
	private boolean alive;
	private boolean prison;
	@NonNull
	@NotNull(message = "specialization cannot be null")
	@Size(min = 3, max = 30, message = "Specialization is invalid should be more than 3 or max 30")
	private String specialization;
	@NonNull
	@NotNull(message = "organization name cannot be null")
	@Size(min = 3, max = 30, message = "organization name is invalid should be more than 3 or max 30 ")
	private String organization;

}
