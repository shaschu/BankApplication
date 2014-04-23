/* 
 * Framework controller class
 * */
package framework.controller;
import framework.view.*;
import framework.helper.*;
import framework.model.*;

import java.util.List;


public class FwController implements IController {
	  //facade data model object
    protected IDataModel dataModel;
    protected ViewPane view;
    protected FwFactory creator;
    
    public FwController(ViewPane view) 
    {
    	this.view = view;
    	//datamodel = creator.createDataModel();
    	dataModel.addObserver(this.view);
    }
    
    public FwController(ViewPane view, FwFactory creator) 
    {
    	this.view = view;
    	this.creator = creator;
    	dataModel = this.creator.createDataModel();
    	dataModel.addObserver(this.view);
    }

    public void setView(ViewPane view) {
        this.view = view;
        //this.view.setVisible(true);
    }

    /**
     *  action to add customer to the data model
     */
    public void addCustomer(Customer customer) {
    	System.out.println("customer "+customer.toString());
    	System.out.println("dmodel "+dataModel);
    	dataModel.insertCustomer(customer);
    	//update the view
		//TODO
		//view.updateView();
    }
 
    /* 
     * add entry to customer account
     *  */
    public void addCustomerAccount(int custNumber,Account account) {
    	dataModel.insertAccount(custNumber, account);
	    //update the view
		//TODO
	     //view.updateView();
    }
    
    /* 
     * add entry to customer account by the account number
     *  */
    public void makeTransacation(int accNumber,Entry entry) {
    	dataModel.insertEntry(accNumber, entry);
    }
    /* 
     * add entry to customer account by the account name
     *  */
    public void makeTransacation(String accName,Entry entry) {
    	dataModel.insertEntry(accName.trim(), entry);
    }
    
    //list and show all accounts of all customers
	@Override
	public void listAccounts(IAction action) {
		//parameter is action rules such sort operations
		List<Account> list = dataModel.allCustomersAccounts(action);
		//update the view
		//TODO
		//view.updateView();
	}
	//list and show all accounts of a particular customer
	@Override
	public void listCustomerAccounts(int custNumber, IAction action) {
		//parameters  
		//1 =>  customer number
		//2 = > action rules such sort operations
		List<Account> accounts = dataModel.customerAccounts(custNumber,action);
		//update the view
		//TODO
		//view.updateView();
	}
    
}
