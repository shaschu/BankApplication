
package creditcard.controller;

import javax.swing.JFrame;

import creditcard.model.Bronze;
import creditcard.model.Gold;
import creditcard.model.Silver;
import bank.model.*;
import framework.helper.*;
import framework.model.*;
import framework.view.UI;
import framework.view.ViewPane;

public class CreditCardFactory extends FwFactory{

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
	 case 2:
		 return new Gold();
	 case 3:
		 return new Silver();
	 case 4:
		 return new Bronze();
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
	return new Personal(name, email, street, city, state, zip, ccNumber, expDate, atype);
}



}
