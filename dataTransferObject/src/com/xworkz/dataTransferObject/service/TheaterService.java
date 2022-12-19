package com.xworkz.dataTransferObject.service;

import com.xworkz.dataTransferObject.dto.TheaterDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;

public interface TheaterService {
	boolean validAndSave(TheaterDTO dto) throws DataInvalidException;
}
