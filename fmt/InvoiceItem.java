package com.fmt;

import java.time.temporal.ChronoUnit;

public abstract class InvoiceItem extends Item{

	private String invoiceCode;

	public InvoiceItem(String invoiceCode, String code) {
		super(code);
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceCode() {
		return invoiceCode;
	}

	@Override
	public String toString() {
		return "InvoiceItem [invoiceCode=" + invoiceCode + "]";
	}
	
public abstract double getCost();
	
}