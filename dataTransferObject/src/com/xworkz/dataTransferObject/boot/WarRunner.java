package com.xworkz.dataTransferObject.boot;

import java.time.LocalDateTime;

import com.xworkz.dataTransferObject.dto.WarDTO;
import com.xworkz.dataTransferObject.repository.WarRepo;
import com.xworkz.dataTransferObject.repository.WarRepoImpli;

public class WarRunner {

	public static void main(String[] args) {
		WarRepo repo = new WarRepoImpli();
		WarDTO war = new WarDTO("indopak", LocalDateTime.of(1965, 8, 05, 6, 32), LocalDateTime.of(1965, 9, 23, 6, 0),
				"pak", "india", "india", 10000);
		repo.create(war);
		WarDTO dto = repo.findByStartedBy("pak");

		WarDTO dto1 = repo.findByStartedByAndStartedWith("pak", "india");
		System.out.println(dto1);
		WarDTO dto2 = repo.findByStartedDateAndEndDate(LocalDateTime.of(1965, 8, 05, 6, 32),
				LocalDateTime.of(1965, 9, 23, 6, 0));
		System.out.println(dto2);
		WarDTO dto3 = repo.findStartedDateGreaterThanOrEqual(LocalDateTime.of(1975, 8, 05, 6, 32));
		System.out.println(dto3);
		WarDTO dto4 = repo.findStartedDateLesserThanOrEqual(LocalDateTime.of(1945, 8, 05, 6, 32));
	}

}
