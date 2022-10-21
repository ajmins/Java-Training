package Assignment2.Problem1;
/*
 * 	The above interface should be implemented using a Customer class
	Member variables of Customer class
	customerName
	depositType
	baseAmount
	Use Parameterized constructor for initialization
	The implementation of the functions depositAmount and withdrawAmount should be written here
	depositAmount –add the base amount
	withdrawAmount –subtract the base amount
 */
public class Customer  implements iBanking{

	private String customerName;
	private String depositType;
	private int baseAmount;
	private int balance;
	
	public Customer(String customerName, String depositType, int baseAmount) {
		this.customerName = customerName;
		this.depositType = depositType;
		this.baseAmount = baseAmount;
		this.balance = 0;
	}

	@Override
	public int depositAmount(int amount) {
		if (balance == 0) {
			balance = this.baseAmount + amount;
		}
		else {
			balance = balance+ amount;
		}
		return balance;
	}

	@Override
	public int withdrawAmount(int amount) {
		if (balance == 0) {
			balance = this.baseAmount - amount;
		}
		else {
			balance = balance - amount;
		}
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getDepositType() {
		return depositType;
	}

	public double getBaseAmount() {
		return baseAmount;
	}


	
	
	
}
