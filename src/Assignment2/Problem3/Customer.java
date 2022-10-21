package Assignment2.Problem3;

/* Create a class named Customer
Member variables are:
customerName
depositType
baseAmount
*/
public class Customer {
	private String customerName;
	private String depositType;
	private int baseAmount;
	
	

	public Customer(String customerName, String depositType, int initialAmount) {
		this.customerName = customerName;
		this.depositType = depositType;
		this.baseAmount = initialAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getDepositType() {
		return depositType;
	}
	public int getBaseAmount() {
		return baseAmount;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}
	public void setBaseAmount(int baseAmount) {
		this.baseAmount = baseAmount;
	}

	
}
