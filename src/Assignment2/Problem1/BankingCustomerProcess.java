package Assignment2.Problem1;

import java.util.ArrayList;
import java.util.List;

/*
	Create an interface iBanking with the following function
	depositAmount(int amount) : returns int
	withdrawAmount(int amount):return int
	
	The above interface should be implemented using a Customer class
	Member variables of Customer class
	customerName
	depositType
	baseAmount
	Use Parameterized constructor for initialization
	The implementation of the functions depositAmount and withdrawAmount should be written here
	depositAmount –add the base amount
	withdrawAmount –subtract the base amount
	
	Main class name-BankingCustomerProcess
	Create the list of customers and display the details of the customers;
	Create two static methods depositProcessing() which shows that the deposit of the amount is taking
	place.
	withdrawProcessing() which shows the withdrawal of the amount is taking place.
 */
public class BankingCustomerProcess {

	public static void main(String[] args) {

		List<Customer> customerList = new ArrayList<>();
		Customer customer1 = new Customer("John", "Current", 1000);
		Customer customer2 = new Customer("Jone", "Current", 1500);
		customerList.add(customer1);
		customerList.add(customer2);
		System.out.println("List of customers\nCustomerName\tDepositType\tBaseAmount");
		for (int i = 0; i < customerList.size(); i++) {
			System.out.println(customerList.get(i).getCustomerName()+"\t\t"+customerList.get(i).getDepositType()+"\t\t"+customerList.get(i).getBaseAmount());
		}
		//customer1.depositAmount(1200);
		depositProcessing(customer1,1000);
		depositProcessing(customer1,1500);
		withdrawProcessing(customer2,100);
	}
	public static void depositProcessing(Customer name,int amount) {
		System.out.println("Customer "+name.getCustomerName()+" deposit "+amount);
		System.out.println("Total Balance: "+name.depositAmount(amount));
	}
	public static void withdrawProcessing(Customer name, int amount) {
		System.out.println("Customer "+name.getCustomerName()+" deposit "+amount);
		System.out.println("Total Balance: "+name.withdrawAmount(amount));
	}

}
