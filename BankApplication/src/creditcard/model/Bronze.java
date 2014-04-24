package creditcard.model;

import framework.model.Account;
import framework.model.Customer;

public class Bronze extends Account{
	
	public final static double interest=1.1;
	
	public  Bronze(){
		super();
	}
	public Bronze(Customer customer) {
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
