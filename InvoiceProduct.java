package com.fmt;

public class InvoiceProduct extends Product {
	 
	private double quantity;

	public InvoiceProduct(String code, String record, String name, String unit, double unitPrice, double quantity) {
		super(code, record, name, unit, unitPrice);
		this.quantity = quantity;
	}

	public double getQuantity() {
		return quantity;
	}
	
	
	
}
