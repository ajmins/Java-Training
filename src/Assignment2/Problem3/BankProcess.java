package Assignment2.Problem3;
/*
 * Create a class named Customer
Member variables are:
customerName
depositType
baseAmount

Create a class named Bank
Member variables are:
bankName
List&lt;Customer&gt;customers

Create a main class such as BankProcess
Initialize the new bank
Perform examples of Add/Delete/View of customer details of a particular bank
 */
public class BankProcess {

	public static void main(String[] args) {

		Bank bank = new Bank("IMB");
		bank.addNewCustomer("John", "Savings", 1500);
		bank.addNewCustomer("Johny", "Savings", 1600);
		bank.listCustomer(bank);
		bank.addNewCustomer("John", "Savings", 1200);
		bank.removeCustomer("Johne");
		bank.listCustomer(bank);
		
		Bank bank2 =  new Bank("Indian");
		bank2.removeCustomer("Mary");
		bank2.addNewCustomer("Mariana", "Fixed", 105200);
		bank2.listCustomer(bank2);

	}

}
