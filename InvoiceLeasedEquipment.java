package com.fmt;

import java.time.LocalDate;

public class InvoiceLeasedEquipment extends Equipment {

	private double fee;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public InvoiceLeasedEquipment(String code, String record, String name, String model, double fee,
			LocalDate startDate, LocalDate endDate) {
		super(code, record, name, model);
		this.fee = fee;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public double getFee() {
		return fee;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	
	
}
