package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.BuildingDTO;
import com.xworkz.dataTransferObject.exception.SizeExceedException;

public interface BuildingRepo {
	boolean store(BuildingDTO dto) throws SizeExceedException;
}
