package com.xworkz.dataTransferObject.dto;

import java.time.LocalDateTime;

public class WarDTO extends AbstractAudit {
	private String name;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String startedBy;
	private String startedWith;
	private String wonBy;
	private int noOfDeath;

	public WarDTO(String name, LocalDateTime startDate, LocalDateTime endDate, String startedBy, String startedWith,
			String wonBy, int noOfDeath) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startedBy = startedBy;
		this.startedWith = startedWith;
		this.wonBy = wonBy;
		this.noOfDeath = noOfDeath;

	}

	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", startedBy=" + startedBy
				+ ", startedWith=" + startedWith + ", wonBy=" + wonBy + ", noOfDeath=" + noOfDeath + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getStartedBy() {
		return startedBy;
	}

	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}

	public int getNoOfDeath() {
		return noOfDeath;
	}

	public void setNoOfDeath(int noOfDeath) {
		this.noOfDeath = noOfDeath;
	}

}
