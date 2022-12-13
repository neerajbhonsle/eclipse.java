package com.xworkz.dataTransferObject.boot;

import java.time.LocalDateTime;

import com.xworkz.dataTransferObject.dto.IplDTO;
import com.xworkz.dataTransferObject.repository.IplRepoImpli;
import com.xworkz.dataTransferObject.repository.IplRepository;

public class IplRunner {

	public static void main(String[] args) {
		IplRepository iplRepository = new IplRepoImpli();
		IplDTO team1 = new IplDTO();
		team1.setTeamName("CSK");
		team1.setCaptainName("Dhoni");
		team1.setOwnerAlive(true);
		team1.setPurse(143);
		team1.setWins(120);
		team1.setDefeats(97);
		team1.setCreatedBy("SYSTEM");
		team1.setCreatedDate(LocalDateTime.now());
		team1.setUpdatedBy("USER");
		team1.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team1);

		System.out.println("*************************************************************");
		IplDTO team2 = new IplDTO();
		team2.setTeamName("RCB");
		team2.setCaptainName("Faf");
		team2.setOwnerAlive(true);
		team2.setPurse(104);
		team2.setWins(107);
		team2.setDefeats(120);
		team2.setCreatedBy("SYSTEM");
		team2.setCreatedDate(LocalDateTime.now());
		team2.setUpdatedBy("USER");
		team2.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team2);

		System.out.println("*************************************************************");
		IplDTO team3 = new IplDTO();
		team3.setTeamName("KKR");
		team3.setCaptainName("Iyer");
		team3.setOwnerAlive(true);
		team3.setPurse(84);
		team3.setWins(106);
		team3.setDefeats(122);
		team3.setCreatedBy("SYSTEM");
		team3.setCreatedDate(LocalDateTime.now());
		team3.setUpdatedBy("USER");
		team3.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team3);

		System.out.println("*************************************************************");
		IplDTO team4 = new IplDTO();
		team4.setTeamName("MI");
		team4.setCaptainName("Rohit");
		team4.setOwnerAlive(true);
		team4.setPurse(100);
		team4.setWins(130);
		team4.setDefeats(90);
		team4.setCreatedBy("SYSTEM");
		team4.setCreatedDate(LocalDateTime.now());
		team4.setUpdatedBy("USER");
		team4.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team4);

		System.out.println("*************************************************************");
		IplDTO team5 = new IplDTO();
		team5.setTeamName("LSG");
		team5.setCaptainName("Rahul");
		team5.setOwnerAlive(true);
		team5.setPurse(105);
		team5.setWins(10);
		team5.setDefeats(7);
		team5.setCreatedBy("SYSTEM");
		team5.setCreatedDate(LocalDateTime.now());
		team5.setUpdatedBy("USER");
		team5.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team5);

		System.out.println("*************************************************************");
		IplDTO team6 = new IplDTO();
		team6.setTeamName("DC");
		team6.setCaptainName("Rishab");
		team6.setOwnerAlive(true);
		team6.setPurse(106);
		team6.setWins(108);
		team6.setDefeats(100);
		team6.setCreatedBy("SYSTEM");
		team6.setCreatedDate(LocalDateTime.now());
		team6.setUpdatedBy("USER");
		team6.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team6);

		System.out.println("*************************************************************");
		IplDTO team7 = new IplDTO();
		team7.setTeamName("PK");
		team7.setCaptainName("Mayank");
		team7.setOwnerAlive(true);
		team7.setPurse(102);
		team7.setWins(105);
		team7.setDefeats(110);
		team7.setCreatedBy("SYSTEM");
		team7.setCreatedDate(LocalDateTime.now());
		team7.setUpdatedBy("USER");
		team7.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team7);

		System.out.println("*************************************************************");
		IplDTO team8 = new IplDTO();
		team8.setTeamName("RR");
		team8.setCaptainName("Samson");
		team8.setOwnerAlive(true);
		team8.setPurse(110);
		team8.setWins(100);
		team8.setDefeats(125);
		team8.setCreatedBy("SYSTEM");
		team8.setCreatedDate(LocalDateTime.now());
		team8.setUpdatedBy("USER");
		team8.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team8);

		System.out.println("*************************************************************");
		IplDTO team9 = new IplDTO();
		team9.setTeamName("SHR");
		team9.setCaptainName("Kane");
		team9.setOwnerAlive(true);
		team9.setPurse(86);
		team9.setWins(101);
		team9.setDefeats(113);
		team9.setCreatedBy("SYSTEM");
		team9.setCreatedDate(LocalDateTime.now());
		team9.setUpdatedBy("USER");
		team9.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team9);

		System.out.println("*************************************************************");
		IplDTO team10 = new IplDTO();
		team10.setTeamName("GT");
		team10.setCaptainName("Hardik");
		team10.setOwnerAlive(true);
		team10.setPurse(76);
		team10.setWins(12);
		team10.setDefeats(2);
		team10.setCreatedBy("SYSTEM");
		team10.setCreatedDate(LocalDateTime.now());
		team10.setUpdatedBy("USER");
		team10.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team10);
		System.out.println("*************************************************************");
		IplDTO team11 = new IplDTO();
		team11.setTeamName("SHR");
		team11.setCaptainName("Kane");
		team11.setOwnerAlive(true);
		team11.setPurse(86);
		team11.setWins(101);
		team11.setDefeats(113);
		team11.setCreatedBy("SYSTEM");
		team11.setCreatedDate(LocalDateTime.now());
		team11.setUpdatedBy("USER");
		team11.setUpdatedDate(LocalDateTime.now());
		iplRepository.createTeams(team11);

		
	}

}
