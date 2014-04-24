package creditcard.model;

import framework.model.Account;
import framework.model.Customer;

public class Silver extends Account{
	
	public final static double interest=0.9;
	
	public  Silver(){
		super();
	}
	public Silver(Customer customer) {
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
