package com.fmt;

public class Service extends Item {

	private String code;
	private String record;
	private String name;
	private double hourlyRate;
	
	
	
	public Service(String code, String record, String name, double hourlyRate) {
		super(code);
		this.record = record;
		this.name = name;
		this.hourlyRate = hourlyRate;
	}


	public String getCode() {
		return code;
	}
	
	public String getRecord() {
		return record;
	}

	public String getName() {
		return name;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public String toString() {
		return String.format("%s, %s, %s, %f", code, record, name, hourlyRate);
		
	}
	
}
