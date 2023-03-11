package com.fmt;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class InvoiceReport {

	public static void main(String[] args) {
		
		String invoiceInput = "data/Invoice.csv";
		String itemInput = "data/Items.csv";
		String personInput = "data/persons.csv";
		String storeInput = "data/stores.csv";
		String invoicedItemInput = "data/InvoiceItems.csv";
				
		Map<String, Person> persons = ParseData.loadPersonData(personInput);
		Map<String, Store> stores = ParseData.loadStoreData(storeInput, persons);
		Map<String, Item> items = ParseData.loadItems(itemInput);
		Map<String, Invoice> invoices = ParseData.loadInvoice(invoiceInput, stores, persons);
		Map<String, List<InvoiceItem>> invoicedItems = ParseData.loadInvoiceItems(invoicedItemInput);	
		
		InvoiceLeasedEquipment invoiceLeasedEquipment = new InvoiceLeasedEquipment("INV000", "3g2e4", 3500, LocalDate.parse("2022-01-01"), LocalDate.parse("2022-12-31"));
		double x = invoiceLeasedEquipment.getCost();
		System.out.println(x);
		
		
		
		
//		for (Map.Entry<String, List<InvoiceItem>> invoicedItem : invoicedItems.entrySet()) {
//		    System.out.println(invoicedItem.getKey() + " : " + invoicedItem.getValue().toString());
//		}
//		
//		System.out.println();
//		
//		for (Map.Entry<String, Invoice> invoice : invoices.entrySet()) {
//		    System.out.println(invoice.getKey() + " : " + invoice.getValue().toString());
//		}
//		
//		System.out.println();
//		
//		for (Map.Entry<String, Invoice> invoice : invoices.entrySet()) {
//		    for(Map.Entry<String, List<InvoiceItem>> invoicedItem : invoicedItems.entrySet()) {
//		    	if(invoice.getKey().equals(invoicedItem.getKey())) {
//		    		invoice.getValue().setInvoiceItems(invoicedItem.getValue());
//		    		
//		    	}
//		    }	
//		}
		
		
	}
}
