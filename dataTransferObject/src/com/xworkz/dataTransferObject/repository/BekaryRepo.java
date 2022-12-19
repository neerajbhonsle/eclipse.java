package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.BekaryDTO;
import com.xworkz.dataTransferObject.exception.SizeExceedException;

public interface BekaryRepo {
	boolean store(BekaryDTO dto) throws SizeExceedException;

}
