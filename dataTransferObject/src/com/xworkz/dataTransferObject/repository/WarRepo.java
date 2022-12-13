package com.xworkz.dataTransferObject.repository;

import java.time.LocalDateTime;

import com.xworkz.dataTransferObject.dto.WarDTO;

public interface WarRepo {
	boolean create(WarDTO wardto);

	boolean create(WarDTO[] wardto);

	default WarDTO findByStartedBy(String startedBy) {
		return null;
	}

	default WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		return null;

	}

	default WarDTO findStartedDateGreaterThanOrEqual(LocalDateTime date) {
		return null;

	}

	default WarDTO findStartedDateLesserThanOrEqual(LocalDateTime date) {
		return null;

	}

	default WarDTO findByStartedDateAndEndDate(LocalDateTime startIn, LocalDateTime endIn) {
		return null;

	}
}
