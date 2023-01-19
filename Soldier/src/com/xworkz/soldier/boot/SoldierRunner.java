package com.xworkz.soldier.boot;

import com.xworkz.soldier.DTO.SoldierDTO;
import com.xworkz.soldier.Repo.SoldierRepo;
import com.xworkz.soldier.Repo.SoldierRepoImpli;
import com.xworkz.soldier.Service.SoldierServiceImpli;

public class SoldierRunner {

	public static void main(String[] args) {
		SoldierDTO dto = new SoldierDTO("un", 54, "Topper", "kashmir", "india");

		SoldierServiceImpli impli = new SoldierServiceImpli();
		SoldierRepo repo = new SoldierRepoImpli();
		impli.setRepo(repo);
		impli.validateAndSave(dto);
	}

}
