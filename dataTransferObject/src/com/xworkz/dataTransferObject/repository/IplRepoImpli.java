package com.xworkz.dataTransferObject.repository;

import com.xworkz.dataTransferObject.dto.IplDTO;
import com.xworkz.dataTransferObject.exception.IplTeamLimitExceedException;

public class IplRepoImpli implements IplRepository {
	private IplDTO[] ipl = new IplDTO[10];
	private int currentIplTeams = 0;

	@Override
	public boolean createTeams(IplDTO dto) {
		System.out.println("Running create Teams");
		if (this.currentIplTeams >= ipl.length) {
			throw new IplTeamLimitExceedException();
		}
		this.ipl[this.currentIplTeams] = dto;
		System.out.println("saved" + dto + "index is " + currentIplTeams);
		currentIplTeams++;
		return true;
	}

}
