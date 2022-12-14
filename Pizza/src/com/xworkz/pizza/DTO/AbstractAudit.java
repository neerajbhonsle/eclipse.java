package com.xworkz.pizza.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAudit implements Serializable {
	private String createdBy;
	private LocalDateTime createdDate;
	private String upadatedBy;
	private LocalDateTime upadatedDate;

	public AbstractAudit() {

	}

	@Override
	public String toString() {
		return "AbstractAudit [createdBy=" + createdBy + ", createdDate=" + createdDate + ", upadatedBy=" + upadatedBy
				+ ", upadatedDate=" + upadatedDate + "]";
	}

	public AbstractAudit(String createdBy, LocalDateTime createdDate, String upadatedBy, LocalDateTime upadatedDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.upadatedBy = upadatedBy;
		this.upadatedDate = upadatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpadatedBy() {
		return upadatedBy;
	}

	public void setUpadatedBy(String upadatedBy) {
		this.upadatedBy = upadatedBy;
	}

	public LocalDateTime getUpadatedDate() {
		return upadatedDate;
	}

	public void setUpadatedDate(LocalDateTime upadatedDate) {
		this.upadatedDate = upadatedDate;
	}

}
