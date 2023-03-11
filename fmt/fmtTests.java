package com.fmt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import com.google.gson.Gson;

public class fmtTests {

	public static void main(String[] args) {
	
		String personInput = args[0];
		Map<String, Person> persons = ParseData.loadPersonData(personInput);
		
		
		for (Map.Entry<String, Person> person : persons.entrySet()) {
		    System.out.println(person.getKey() + " : " + person.getValue().toString());
		}
		
		System.out.println();
		
		String storeInput = args[1];
		Map<String, Store> stores = ParseData.loadStoreData(storeInput, persons);
		
		for (Entry<String, Store> store : stores.entrySet()) {
		    System.out.println(store.getKey() + " : " + store.getValue().toString());
		}
		
		System.out.println();

		String invoiceInput = args[2];
		Map<String, Item> items = ParseData.loadItems(invoiceInput);
		
		for (Entry<String, Item> item : items.entrySet()) {
		    System.out.println(item.getKey() + " : " + item.getValue().toString());
		}
	
	}
	
	
}
	