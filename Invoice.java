package com.fmt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Invoice {

	private String invoiceCode;
	private Store store;
	private Person customer;
	private Person salesperson;
	private LocalDate invoiceDate;
	private List<Item> items;
	
	public Invoice(String invoiceCode, Store store, Person customer, Person salesperson, LocalDate invoiceDate) {
		super();
		this.invoiceCode = invoiceCode;
		this.store = store;
		this.customer = customer;
		this.salesperson = salesperson;
		this.invoiceDate = invoiceDate;
		this.items = new ArrayList<> ();
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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	
}
