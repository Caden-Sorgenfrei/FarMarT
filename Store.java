package com.fmt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Store {

		private String storeCode;
		private Person manager;
		private Address address;
		
		public Store(String storeCode, Person manager, Address address) {
			super();
			this.storeCode = storeCode;
			this.manager = manager;
			this.address = address;
		}

		public String getStoreCode() {
			return storeCode;
		}

		public Person getManager() {
			return manager;
		}

		public Store(Address address) {
			this.address = address;
		}
		
		public String toString() {
			return String.format("%s, %s, %s", storeCode, manager.toString(), address.toString());
			
		}
		
		
}
