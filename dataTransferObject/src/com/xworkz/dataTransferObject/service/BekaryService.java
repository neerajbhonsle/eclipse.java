package com.xworkz.dataTransferObject.service;

import com.xworkz.dataTransferObject.dto.BekaryDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;

public interface BekaryService {
	boolean validAndStore(BekaryDTO dto) throws DataInvalidException;

}
