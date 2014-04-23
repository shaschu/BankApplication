package framework.helper;
import javax.swing.JFrame;

import framework.model.*;
import framework.view.UI;
import framework.view.ViewPane;

public abstract class FwFactory extends AFactory{


	@Override
	public Customer createPersonalCustomer(String name, String street, String city,
			String state, String zip, String email,String birthdate) {
		//String name, String email, String street, String city, String state, String zip, String birthdate
		return new Personal(name, email,street, city, state, zip, birthdate);
	}

	@Override
	public Customer createCompanyCustomer(String name, String street, String  city, String state, 
            String zip, String email, int numOfEmps) {
		//String name, String email, String street, String city, String state, String zip, String no_of_Employee
		return new Organization(name, email,street, city, state, zip, numOfEmps);
	}

	@Override
	public Entry createEntry(double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	 public abstract IDataModel createDataModel() ;
	
	 public  abstract ViewPane defaultPane(UI parentWindow);
}
