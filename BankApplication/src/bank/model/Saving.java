package bank.model;

import framework.model.Account;
import framework.model.Customer;

/*
 * Saving account for Bank
 * */
public class Saving extends Account{

	public Saving(){
	  super();	
	}
	public Saving(Customer customer) {
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
