package com.xworkz.Collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.Collection.DTO.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {
		Collection<PalaceDTO> palace = new ArrayList();
		palace.add(new PalaceDTO("bangaluru", "bangaluru", "dono", false, 20));
		palace.add(new PalaceDTO("mysore", "mysore", "dono", false, 200));
		palace.add(new PalaceDTO("lalith", "bangaluru", "dono", true, 10));

		palace.stream().filter((dto) -> !dto.isDestroyed()).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto));
	}

}
