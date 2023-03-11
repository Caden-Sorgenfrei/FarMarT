package com.fmt;

public class InvoicePurchasedEquipment extends InvoiceItem {

	private double price;

	public InvoicePurchasedEquipment(String invoiceCode, String code,  double price) {
		super(code, invoiceCode);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
		
	@Override
	public String toString() {
		return "InvoicePurchasedEquipment [price=" + price + "]";
	}

	@Override
	public double getCost() {
		return price;
	}
		
}
