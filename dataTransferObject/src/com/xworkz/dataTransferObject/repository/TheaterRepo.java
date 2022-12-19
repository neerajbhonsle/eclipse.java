package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.TheaterDTO;
import com.xworkz.dataTransferObject.exception.SizeExceedException;

public interface TheaterRepo {
	boolean store(TheaterDTO dto) throws SizeExceedException;
}
