package com.xworkz.Xworkz.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class NeerajDTO {
	
	private int id;
	@NotBlank
	@Size(min = 3, max = 20, message = "company cannot be less than 3 or greater than 20")
	private String brand;
	@NotBlank
	@Size(min = 3, max = 20, message = "company cannot be less than 3 or greater than 20")
	private String name;
	@NotNull
	private Double cost;
	@NotBlank
	private String type;
	@NotBlank
	@Size(min = 3, max = 20, message = "company cannot be less than 3 or greater than 20")
	private String madeIn;

}
