package com.xworkz.soldier.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.DTO.ResortDTO;
import com.xworkz.soldier.Repo.ResortRepo;

@Component
public class ResortServiceImpli implements ResortService {
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	public ResortServiceImpli(ResortRepo resortRepo) {
		this.resortRepo=resortRepo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Running validate and save");
		System.out.println("ResortDTO " + dto);

		Set<ConstraintViolation<ResortDTO>> violation = this.validator.validate(dto);
		if (!violation.isEmpty()) {
			violation.forEach((v -> {
				System.err.println("violating message :" + v.getMessage());
			}));
			return false;
		} else

		{
			System.out.println("data entried is valid");
			boolean saved2 = resortRepo.save1(dto);
			System.out.println(saved2);
			return saved2;
		}
	}
}
