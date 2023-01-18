package com.xworkz.soldier.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class SoldierDTO extends AbstractAuditDTO {
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20, message = "name is invalid, should be min 3 or max 20")
	private String name;
	@Min(value = 2, message = "id number must be min 2 or max 10000")
	@Max(value = 10000, message = "id number must be min 2 or max 10000")
	private int id;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 25, message = "rank is invalid, should be min 3 or max 20")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 30, message = "batallion is invalid, should be min 3 or max 20")
	private String batallion;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 30, message = "Country name is invalid, should be min 3 or max 20")
	private String country;

}
