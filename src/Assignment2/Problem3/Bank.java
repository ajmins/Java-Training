package Assignment2.Problem3;
/*
 * Create a class named Bank
Member variables are:
bankName
List<Customer>customers
 */

import java.util.ArrayList;
import java.util.List;



public class Bank {

	private String bankName;
	private List<Customer>customers;
	
	public Bank(String bankName) {
		this.bankName = bankName;
		this.customers = new ArrayList<Customer>();
	}
	
	public String getName() {
		return bankName;
	}

	public void addNewCustomer(String customerName, String depositType, int baseAmount) {
		if (findCustomer(customerName) == null) {
			this.customers.add(new Customer(customerName,depositType, baseAmount));
			System.out.println("Customer added");
		}
		else {
			System.out.println("Customer is not added");
		}
			
	}
	public void removeCustomer(String customerName) {
		if ((findCustomer(customerName) != null)) {
			for (int i = 0; i < customers.size(); i++) {
				if (customers.get(i).getCustomerName().equals(customerName)) {
					this.customers.remove(customers.get(i));
				}
			}
			System.out.println("Customer removed");
		}
		else {
			System.out.println(customerName + " Customer doesn't exist");
		}
	}

	public void listCustomer(Bank bank) {
		System.out.println("\nList of customers in "+ bank.getName()+" bank\n"+"CustomerName\tDepositType\tBaseAmount");
		for (int i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i).getCustomerName()+"\t\t"+customers.get(i).getDepositType()+"\t\t"+customers.get(i).getBaseAmount());
		}
		System.out.println();
	}
	
	private Customer findCustomer(String customerName) {
		for (int i = 0; i < this.customers.size(); i++) {
			Customer checkedCustomer = this.customers.get(i);
			if (checkedCustomer.getCustomerName().equals(customerName)) {
				return checkedCustomer;
			}
		}
		return null;
	
}
}
