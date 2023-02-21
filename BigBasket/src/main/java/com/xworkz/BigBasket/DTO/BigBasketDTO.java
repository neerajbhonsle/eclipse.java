package com.xworkz.BigBasket.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BigBasketDTO {
	@NotBlank
	@Size(min = 3, max = 20, message = "Name cannot be less than 3 or greater than 20")
	private String name;
	private Long phoneNumber;
	@NotBlank
	private String emailAddress;
	@NotBlank
	private String password;
	@Size(min = 3, max = 20, message = "Name cannot be less than 3 or greater than 20")
	private String wifeName;
	@NotBlank(message = "food should be selected")
	private String food;
	@NotBlank(message = "area should be selected")
	private String area;
	@NotNull(message = "price should be selected")
	private Double price;
	@NotBlank
	@Size(min = 3, max = 20, message = "ownerName cannot be less than 3 or greater than 20")
	private String ownerName;
	@NotBlank
	@Size(min = 3, max = 20, message = "ownerWifeName cannot be less than 3 or greater than 20")
	private String ownerWifeName;
}
