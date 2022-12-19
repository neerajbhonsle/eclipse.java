package com.xworkz.dataTransferObject.service;

import com.xworkz.dataTransferObject.dto.RailwayDTO;
import com.xworkz.dataTransferObject.exception.DataInvalidException;

public interface RailwayService {
	boolean validAndSave(RailwayDTO dto) throws DataInvalidException;

}
