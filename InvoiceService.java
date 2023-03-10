package com.fmt;

public class InvoiceService extends Service {

	private double hours;

	public InvoiceService(String code, String record, String name, double hourlyRate, double hours) {
		super(code, record, name, hourlyRate);
		this.hours = hours;
	}

	public double getHours() {
		return hours;
	}
	
	
}
