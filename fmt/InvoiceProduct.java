package com.fmt;

public class InvoiceProduct extends InvoiceItem {
	 
	private double quantity;

	public InvoiceProduct(String invoiceCode, String code, double quantity) {
		super(code, invoiceCode);
		this.quantity = quantity;
	}

	public double getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "InvoiceProduct [quantity=" + quantity + "]";
	}

	@Override
	public double getCost() {
		return 0;
	}
	
	
	
}
