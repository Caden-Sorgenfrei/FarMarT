package com.fmt;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ParseData {

	public static Map<String, Person> loadPersonData(String inputFile) {

		Map<String, Person> personMap = new HashMap<>();
		
		Scanner s = null;
		try {
			s = new Scanner(new File(inputFile));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		int lines = Integer.parseInt(s.nextLine());
		
		for(int i=0; i<lines; i++) {
			String fileData = s.nextLine();
			String tokens[] = fileData.split(",");	
			List<String> emails = new ArrayList<>();
			
			for(int j = 8; j<tokens.length; j++) {
				emails.add(tokens[j]);
			}
		
			Address tempAddress = new Address(tokens[3], tokens[4], tokens[5], Integer.parseInt(tokens[6]), tokens[7]);
			Person tempPerson = new Person(tokens[0], tokens[1], tokens[2], tempAddress, emails);
			
			personMap.put(tokens[0], tempPerson);
		}
		s.close();
		return personMap;
	}
		
	public static Map<String, Store> loadStoreData(String inputFile, Map<String,Person> m) {
			
		Map<String, Store> storeMap = new HashMap<>();
			
		Scanner s = null;
		try {
			s = new Scanner(new File(inputFile));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		int lines = Integer.parseInt(s.nextLine());
			
		for(int i=0; i<lines; i++) {
			String fileData = s.nextLine();
			String tokens[] = fileData.split(",");
				
			Address tempAddress = new Address(tokens[2], tokens[3], tokens[4], Integer.parseInt(tokens[5]), tokens[6]);
			Store tempStore = new Store(tokens[0], m.get(tokens[1]), tempAddress);
			
			storeMap.put(tokens[0], tempStore);
		}
		s.close();
		return storeMap;
	}

	public static Map<String, Item> loadInvoiceData(String inputFile) {
			
		Map<String, Item> invoiceDataMap = new HashMap<>();
			
		Scanner s = null;
		try {
			s = new Scanner(new File(inputFile));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		int lines = Integer.parseInt(s.nextLine());
			
		for(int i=0; i<lines; i++) {
			String fileData = s.nextLine();
			String tokens[] = fileData.split(",");
				
			if(tokens[1].contains("E")) {
				Equipment tempEquipment = new Equipment(tokens[0], tokens[1], tokens[2], tokens[3]);
				invoiceDataMap.put(tokens[0], tempEquipment);
			}else if (tokens[1].contains("P")) {
				Product tempProduct = new Product(tokens[0], tokens[1], tokens[2], tokens[3], Double.parseDouble(tokens[4]));
				invoiceDataMap.put(tokens[0], tempProduct);
			}else if (tokens[1].contains("S")) {
				Service tempService = new Service(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]));
				invoiceDataMap.put(tokens[0], tempService);
			}
		}
		s.close();
		return invoiceDataMap;
	}
	
	public static Map<String, Invoice> loadInvoice(String inputFile, Map<String,Store> storeMap, Map<String,Person> personMap) {
		
		Map<String, Invoice> invoiceMap = new HashMap<>();
			
		Scanner s = null;
		try {
			s = new Scanner(new File(inputFile));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		int lines = Integer.parseInt(s.nextLine());
			
		for(int i=0; i<lines; i++) {
			String fileData = s.nextLine();
			String tokens[] = fileData.split(",");
				
			Invoice tempInvoice = new Invoice(tokens[0], storeMap.get(tokens[1]), personMap.get(tokens[2]), 
											  personMap.get(tokens[3]), LocalDate.parse(tokens[4]));
			
			invoiceMap.put(tokens[0], tempInvoice);
		}
		s.close();
		return invoiceMap;
	}
	
	public static Map<String, List<Item>> loadInvoiceItems(String inputFile) {
		
		Map<String,List<Item>> itemMap = new HashMap<>();
			
		Scanner s = null;
		try {
			s = new Scanner(new File(inputFile));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		int lines = Integer.parseInt(s.nextLine());
			
		for(int i=0; i<lines; i++) {
			String fileData = s.nextLine();
			String tokens[] = fileData.split(",");
			
			if(itemMap.containsKey(tokens[0]) == true) {
				
			}else if(tokens[2].contains("P")) {
				
			}else if(tokens[2].contains("L")) {
				
			}
			
//				
//			if(tokens[1].contains("E")) {
//				Equipment tempEquipment = new Equipment(tokens[0], tokens[1], tokens[2], tokens[3]);
//				invoiceMap.put(tokens[0], tempEquipment);
//			}else if (tokens[1].contains("P")) {
//				Product tempProduct = new Product(tokens[0], tokens[1], tokens[2], tokens[3], Double.parseDouble(tokens[4]));
//				invoiceMap.put(tokens[0], tempProduct);
//			}else if (tokens[1].contains("S")) {
//				Service tempService = new Service(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]));
//				invoiceMap.put(tokens[0], tempService);
//			}
			
		}
		s.close();
		return itemMap;
	}
	
//	public static Map<String, Invoice> loadInvoiceItems(String inputFile) {
//		
//		Map<String, Invoice> invoiceItemMap = new HashMap<>();
//			
//		Scanner s = null;
//		try {
//			s = new Scanner(new File(inputFile));
//		} catch (FileNotFoundException e) {
//			throw new RuntimeException(e);
//		}
//		int lines = Integer.parseInt(s.nextLine());
//			
//		for(int i=0; i<lines; i++) {
//			String fileData = s.nextLine();
//			String tokens[] = fileData.split(",");
//				
//			
//			
//			invoiceMap.put(tokens[0], tempInvoiceItem);
//		}
//		s.close();
//		return invoiceMap;
//	}
	
	
	
	
}