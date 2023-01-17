package com.xworkz.CRUD.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractAduitDTO implements Serializable {
	private String CreatedBy;
	private LocalDateTime CreatedOn;
	private String updatedBy;
	private LocalDateTime upadatedOn;
}
