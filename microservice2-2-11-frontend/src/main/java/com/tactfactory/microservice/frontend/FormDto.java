package com.tactfactory.microservice.frontend;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormDto {

	private String from;
	private String to;

	@JsonProperty("quantity")
	private BigDecimal amount;
	private BigDecimal totalCalculatedAmount;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTotalCalculatedAmount() {
		return String.format("Convert %s %s give %s %s", this.amount, this.from, this.totalCalculatedAmount, this.to);
	}

	public FormDto() {

	}

	// creating constructor
	public FormDto(String from, String to, BigDecimal amount, BigDecimal totalCalculatedAmount) {
		super();
		this.from = from;
		this.to = to;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
}
