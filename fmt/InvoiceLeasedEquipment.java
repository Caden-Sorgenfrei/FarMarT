package com.fmt;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class InvoiceLeasedEquipment extends InvoiceItem {

	private double fee;
	private LocalDate startDate;
	private LocalDate endDate;

	public InvoiceLeasedEquipment(String invoiceCode, String code, double fee, LocalDate startDate, LocalDate endDate) {
		super(code, invoiceCode);
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

	@Override
	public String toString() {
		return "InvoiceLeasedEquipment [fee=" + fee + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	@Override
	public double getCost() {		
			double rentalPeriod = (double)ChronoUnit.DAYS.between(startDate, endDate) + 1;
			System.out.println(rentalPeriod);
			double total = Math.round((getFee() * (rentalPeriod / 30.0)) * 100.0) / 100.0;
			
			int tax = 0;
			if(total >= 10000 && total < 100000) {
				tax = 500;
			} else if(total >= 100000) {
				tax = 1500;
			}
			
			total += tax;
			
			return total;	
	}

}
