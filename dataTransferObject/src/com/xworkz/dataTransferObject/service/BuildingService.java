package com.xworkz.dataTransferObject.service;

import com.xworkz.dataTransferObject.dto.BuildingDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;

public interface BuildingService {
	boolean validAndStore(BuildingDTO dto) throws DataInvalidException;
}
