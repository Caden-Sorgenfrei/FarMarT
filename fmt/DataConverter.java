package com.fmt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;


import com.google.gson.Gson;


public class DataConverter {
 
	public static <T> void toJson(Map<String, T> map, String outputFile) {
		
		PrintWriter out;
		try {
			out = new PrintWriter(new FileWriter(outputFile));
			Gson gson = new Gson();
            for(T foo : map.values()) {
            	String jsonString = gson.toJson(foo);
            	out.write(jsonString);
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		
	}
	
	public static void main(String args[]){
        
        String personInput = "data/persons.csv";	
        String personOutput = "data/persons.json";
        Map<String, Person> persons = ParseData.loadPersonData(personInput);
		toJson(persons, personOutput);
		
		String storeInput = "data/stores.csv";
		String storeOutput = "data/stores.json";
		Map<String, Store> stores = ParseData.loadStoreData(storeInput, persons);
		toJson(stores, storeOutput);
		
		String invoiceInput = "data/invoices.csv";
		String itemOutput = "data/invoices.json";
		Map<String, Item> items = ParseData.loadItems(invoiceInput);
		toJson(items, itemOutput);
        
    }
		
}
