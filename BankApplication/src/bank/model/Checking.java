package bank.model;

import framework.model.Account;
import framework.model.Customer;

public class Checking extends Account{
	
	public final static double interest=0.8;
	
	public  Checking(){
		super();
	}
	public Checking(Customer customer) {
		super(customer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateMonthlyReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
