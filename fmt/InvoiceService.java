package com.fmt;

public class InvoiceService extends InvoiceItem {

	private double hours;

	public InvoiceService(String invoiceCode, String code, double hours) {
		super(code, invoiceCode);
		this.hours = hours;
	}

	public double getHours() {
		return hours;
	}

	@Override
	public String toString() {
		return "InvoiceService [hours=" + hours + "]";
	}

	@Override
	public double getCost() {
		return 0;
	}
	
	
	
}
