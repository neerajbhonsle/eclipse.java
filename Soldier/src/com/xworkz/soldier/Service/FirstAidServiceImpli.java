package com.xworkz.soldier.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.DTO.FirstAidDTO;
import com.xworkz.soldier.Repo.FirstAidRepo;

@Component
public class FirstAidServiceImpli implements FirstAidService {
	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;

	public FirstAidServiceImpli(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
		System.out.println("created service by passing repo from spring");
	}

	@Override
	public boolean validateAndSave(FirstAidDTO aid) {
		System.out.println("Running validate and save");
		System.out.println("aidDTO :" + aid);

		Set<ConstraintViolation<FirstAidDTO>> violation = this.validator.validate(aid);
		if (!violation.isEmpty()) {
			System.err.println("there are validation error");
			violation.forEach((n -> {
				System.err.println("violating message: " + n.getMessage());
			}));
			return false;
		} else {
			System.out.println("data entried is valid");
			boolean saved1 = this.firstAidRepo.save(aid);
			return saved1;
		}

	}

}
