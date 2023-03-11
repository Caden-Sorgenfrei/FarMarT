package com.fmt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Person {

		private String personCode;
		private String firstName;
		private String lastName;
		private Address address;
		private List<String> emails;

		public Person(String personCode, String firstName, String lastName, Address address, List<String> emails) {
			super();
			this.personCode = personCode;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.emails = emails;
		}


		public String getPersonCode() {
			return personCode;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public List<String> getEmails() {
			return emails;
		}
		
		public String toString() {
			return String.format("%s, %s, %s, %s, %s", personCode, lastName, firstName, address.toString(), getEmails());
			
		}
		
}
