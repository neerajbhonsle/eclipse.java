package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.PlaceDTO;
import com.xworkz.dataTransferObject.exception.SizeExceedException;

public interface PlaceRepo {
	boolean store(PlaceDTO dto) throws SizeExceedException;

}
