package com.fmt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class Invoice {

	private String invoiceCode;
	private Store store;
	private Person customer;
	private Person salesperson;
	private LocalDate invoiceDate;
	private List<InvoiceItem> invoiceItems;
	
	public Invoice(String invoiceCode, Store store, Person customer, Person salesperson, LocalDate invoiceDate) {
		super();
		this.invoiceCode = invoiceCode;
		this.store = store;
		this.customer = customer;
		this.salesperson = salesperson;
		this.invoiceDate = invoiceDate;
		this.invoiceItems = new ArrayList<> ();
	}

	public String getInvoiceCode() {
		return invoiceCode;
	}

	public Store getStore() {
		return store;
	}

	public Person getCustomer() {
		return customer;
	}

	public Person getSalesperson() {
		return salesperson;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public List<InvoiceItem> getInvoiceItems() {
		return invoiceItems;
	}

	public void setInvoiceItems(List<InvoiceItem> items) {
		this.invoiceItems = items;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceCode=" + invoiceCode + ", store=" + store + ", customer=" + customer + ", salesperson="
				+ salesperson + ", invoiceDate=" + invoiceDate + ", items=" + invoiceItems + "]";
	}


	
	
	
}
