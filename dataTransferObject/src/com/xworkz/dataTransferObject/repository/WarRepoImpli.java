package com.xworkz.dataTransferObject.repository;

import java.time.LocalDateTime;

import com.xworkz.dataTransferObject.dto.WarDTO;
import com.xworkz.dataTransferObject.exception.WarLimitExccedException;

public class WarRepoImpli implements WarRepo {
	private WarDTO[] fight = new WarDTO[10];
	private int warIndex = 0;

	@Override
	public boolean create(WarDTO wardto) {
		System.out.println("Running the Warimple");
		if (this.warIndex >= fight.length) {
			throw new WarLimitExccedException();
		}
		this.fight[warIndex] = wardto;
		System.out.println("saved to " + wardto + " at index " + warIndex);
		warIndex++;
		return true;
	}

	@Override
	public boolean create(WarDTO[] wardto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WarDTO findByStartedBy(String startedBy) {
		System.out.println("Running the findByStartedBy " + startedBy);
		for (WarDTO dto : fight) {
			if (dto != null && dto.getStartedBy().equalsIgnoreCase(startedBy)) {
				System.out.println("war startedby " + startedBy);
			}

		}
		System.out.println("dto not found");
		return WarRepo.super.findByStartedBy(startedBy);
	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		System.out.println("Running fingByStartedByAndStartedWith " + startedBy + startedWith);
		for (WarDTO dto : fight) {
			if (dto != null && dto.getStartedBy().equalsIgnoreCase(startedWith)
					&& dto.getStartedWith().equalsIgnoreCase(startedWith)) {
				System.out.println("war startedBy " + startedBy + "war startedWith" + startedWith);
			}
		}
		System.out.println("dto not found");
		return WarRepo.super.findByStartedByAndStartedWith(startedBy, startedWith);
	}

	@Override
	public WarDTO findStartedDateGreaterThanOrEqual(LocalDateTime date) {
		System.out.println("Running findStartedDateGreaterThanOrEqual " + date);
		for (WarDTO dto : fight) {
			if (dto != null && dto.getStartDate().isAfter(date)) {
				System.out.println("war started Date greater than or equal  " + date);
			}
		}
		System.out.println("dto not found");
		return WarRepo.super.findStartedDateGreaterThanOrEqual(date);
	}

	@Override
	public WarDTO findStartedDateLesserThanOrEqual(LocalDateTime date) {
		System.out.println("Running findStartedDateLesserThanOrEqual " + date);
		for (WarDTO dto : fight) {
			if (dto != null && dto.getEndDate().isBefore(date)) {
				System.out.println("war ended date lesser than or equal " + date);
			}
		}
		System.out.println("dto not found");
		return WarRepo.super.findStartedDateLesserThanOrEqual(date);
	}

	@Override
	public WarDTO findByStartedDateAndEndDate(LocalDateTime startIn, LocalDateTime endIn) {
		System.out.println("Running findByStartedDateAndEndDate " + startIn + endIn);
		for (WarDTO dto : fight) {
			if (dto != null) {
				System.out.println("war startIn" + startIn + "& end in " + endIn);
			}
		}
		System.out.println("dto not found");
		return WarRepo.super.findByStartedDateAndEndDate(startIn, endIn);
	}
}
