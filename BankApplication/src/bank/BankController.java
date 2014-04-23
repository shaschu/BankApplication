/* 
 * Framework controller class
 * */
package bank;
import framework.view.*;
import framework.helper.FwFactory;
import framework.helper.IAction;
import framework.model.*;
import framework.controller.*;

import java.util.List;

public class BankController extends FwController {
	  //facade data model object
    public BankController(ViewPane view) {
    	super(view);
    }
    
    public BankController(ViewPane view, FwFactory creator) {
    	super(view, creator);
    } 

    /**
     *  action to Personal customer to the data model
     */
    public void addPersonalCustomer(String name, String street, String city, 
    		                        String state, String zip, String email, String birthdate) 
    {

    	addCustomer(creator.createPersonalCustomer(name, street, city, state, zip, email, birthdate));
    }
    
    /**
     *  action to Personal customer to the data model
     */
    public void addCompanyCustomer(String name, String street, String city, 
    		                       String state, String zip, String email, int numOfEmps) 
    {
    	 
    	super.addCustomer(creator.createCompanyCustomer(name, street, city, state, zip, email, numOfEmps));
    }
 
    /* 
     * add entry to Saving account
     *  */
    public void addSavingAccount(int custNumber,Account account) {
    	//super.addCustomerAccount(custNumber, account);
    }
    
    /* 
     * add deposit to customer account
     *  */
    public void makeDepositTransacation(int accNumber,double amount) {	
       super.makeTransacation(accNumber, creator.createEntry(amount));
    }
    
    /* 
     * add withdrawal to customer account
     *  */
    public void makeWithdrawalTransacation(int accNumber,double amount) {
    	 super.makeTransacation(accNumber, creator.createEntry(amount));
    }
    
}
