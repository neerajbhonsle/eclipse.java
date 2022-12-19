package com.xworkz.dataTransferObject.dto;

public class PlaceDTO extends AbstractAudit {
	private String name;
	private String famousFor;
	private String dist;
	private String state;

	public PlaceDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", famousFor=" + famousFor + ", dist=" + dist + ", state=" + state
				+ ", toString()=" + super.toString() + "]";
	}

	public PlaceDTO(String name, String famousFor, String dist, String state) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		this.dist = dist;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
