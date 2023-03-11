package com.fmt;

public class Product extends Item {

	private String record;
	private String name;
	private String unit;
	private double unitPrice;
	
	public Product(String code, String record, String name, String unit, double unitPrice) {
		super(code);
		this.record = record;
		this.name = name;
		this.unit = unit;
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}


	public String getUnit() {
		return unit;
	}

	public double getUnitPrice() {
		return unitPrice;
	}
	
	public String getRecord() {
		return record;
	}
	
	public String toString() {
		return String.format("%s, %s, %s, %s, %f", record, name, unit, unitPrice);
		
	}
}
