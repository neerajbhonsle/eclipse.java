package com.xworkz.dataTransferObject.service;

import com.xworkz.dataTransferObject.dto.PlaceDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;

public interface PlaceService {
	boolean validAndSave(PlaceDTO dto) throws DataInvalidException;

}
