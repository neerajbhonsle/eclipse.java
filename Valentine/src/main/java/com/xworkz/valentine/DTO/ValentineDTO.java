package com.xworkz.valentine.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDTO {
	@Size(min = 3, max = 20, message = "Name cannot be less than 3 or greater than 20")
	private String name;
	@Size(min = 3, max = 20, message = "Name cannot be less than 3 or greater than 20")
	private String valentineName;
	@NotBlank(message = "gift should be selected")
	private String gifts;
	@NotBlank(message = "place should be selected")
	private String places;

}
