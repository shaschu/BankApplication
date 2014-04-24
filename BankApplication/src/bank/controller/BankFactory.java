
package bank.controller;

import javax.swing.JFrame;

import bank.model.*;
import framework.helper.*;
import framework.model.*;
import framework.view.UI;
import framework.view.ViewPane;

public class BankFactory extends FwFactory{

 @Override
 public IDataModel createDataModel()
 {
	 return new DataModel();
 }

@Override
public ViewPane defaultPane(UI parentWindow) {
	// TODO Auto-generated method stub
	return null;//new BankTablePane(parentWindow);
  }

@Override 
public Account createAccount(String accType){
	 switch(Integer.parseInt(accType)){
	 case 1:
		 return new Saving();
	 case 2:
		 return new Checking();
	 }
	 return null;
  }

@Override
public Entry createEntry(double amount) {
	// TODO Auto-generated method stub
	return new Entry(amount);
}

@Override
public Customer createCCardCustomer(String name, String street, String city,
		String state, String zip, String email, String ccNumber, String expDate,String atype) {
	// TODO Auto-generated method stub
	return null;
}

}
