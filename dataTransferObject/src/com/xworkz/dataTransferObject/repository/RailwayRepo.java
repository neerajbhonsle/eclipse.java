package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.RailwayDTO;
import com.xworkz.dataTransferObject.exception.SizeExceedException;

public interface RailwayRepo {
	boolean store(RailwayDTO dto) throws SizeExceedException;
}
