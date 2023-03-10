package com.fmt;

public class InvoicePruchasedEquipment extends Equipment {

		private double price;

		public InvoicePruchasedEquipment(String code, String record, String name, String model, double price) {
			super(code, record, name, model);
			this.price = price;
		}

		public double getPrice() {
			return price;
		}
		
		
		
}
