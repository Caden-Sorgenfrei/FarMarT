package com.fmt;

public class Equipment extends Item {

	private String record;
	private String name;
	private String model;
	
	public Equipment(String code, String record, String name, String model) {
		super(code);
		this.record = record;
		this.name = name;
		this.model = model;
	}



	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}
	public String toString() {
		return String.format("%s, %s, %s, %s", record, name, model);
		
	}

	public String getRecord() {
		return record;
	}
	
}
