package bank.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import bank.BankUI;
import bank.CompanyAccountDialog;
import bank.DepositDialog;
import bank.PersonalAccountDialog;
import bank.WithdrawDialog;
import framework.helper.IAction;
import framework.model.Account;
import framework.model.Customer;
import framework.view.ActionButton;
import framework.view.FwActionListener;
import framework.view.TableView;
import framework.view.UI;


public class BankTablePane extends TableView{
	private BankUI parentWindow;
	public BankTablePane(){
	 	super();
	}
    public BankTablePane(BankUI parentWindow) {
		super(parentWindow);
		// TODO Auto-generated constructor stub
		this.parentWindow = parentWindow;
	}

	@Override
    public JPanel createActions() {
        JPanel actions = new JPanel(new java.awt.GridLayout(6, 1));
        ActionButton addPersonalAccountButton = new ActionButton();
        ActionButton addCompanyAccountButton = new ActionButton();
        ActionButton addInterestButton = new ActionButton();
        ActionButton depositButton = new ActionButton();
        ActionButton withdrawButton = new ActionButton();
        ActionButton exitButton = new ActionButton();

        addPersonalAccountButton.setText("Add Personal Account");
       // addPersonalAccountButton.setHandler(new AccountHandler(AccountHandler.personal));
        addPersonalAccountButton.addActionListener( new FwActionListener(new IAction(){
            	@Override
				public void performAction() {
            	   
            		new PersonalAccountDialog("Add Personal Account" , parentWindow.getController());
				}	
        	}));
        actions.add(addPersonalAccountButton);

        addCompanyAccountButton.setText("Add Company Account");
        //addCompanyAccountButton.setHandler(new AccountHandler(AccountHandler.company));
        addCompanyAccountButton.addActionListener(new FwActionListener(new IAction(){
        	@Override
			public void performAction() {
        		new CompanyAccountDialog("Add Company Account" ,parentWindow.getController());
			}	
    	}));
         actions.add(addCompanyAccountButton);

        addInterestButton.setText("Add Interest");
        actions.add(addInterestButton);

        depositButton.setText("Deposit");
        //depositButton.setHandler(new AccountHandler(AccountHandler.DepositDialog));
        depositButton.addActionListener(new FwActionListener(new IAction(){
        	@Override
			public void performAction() {
        		new DepositDialog("Deposit into Account", parentWindow.getController());
			}	
    	}));
        actions.add(depositButton);

        withdrawButton.setText("Withdraw");
       // withdrawButton.setHandler(new AccountHandler(AccountHandler.WithdrawDialog));
        withdrawButton.addActionListener(new FwActionListener(new IAction(){
        	@Override
			public void performAction() {
        		new WithdrawDialog("Withdraw from Account",parentWindow.getController());
			}	
    	}));
        actions.add(withdrawButton);

        exitButton.setText("Exit");  
        exitButton.addActionListener(new FwActionListener(new IAction(){
        	@Override
			public void performAction() {
        		System.exit(1);
			}	
    	}));
        actions.add(exitButton);

        return actions;
    }

	@Override
	public DefaultTableModel createModel() {
		   return new DefaultTableModel(
	                new Object[][]{},
	                new String[]{
	            "Name", "Street", "City", "State", "Zip", "P/C", "Ch/S", "Amount"
	        });
	}
	@Override
	
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		updateTableModel(arg);
	}

    public void updateTableModel( Object arg) {
        DefaultTableModel aModel = createModel();
     
        	Object[] objects = new Object[8];
        	Iterator<Customer> customers = ((List) arg).iterator();
        	//populating the tablemodel
        	while (customers.hasNext()) {
	        	Customer customer = customers.next();
	        	objects[0] = customer.getName();
	        	objects[1] = customer.getStreet();
	        	objects[2] = customer.getCity();
	        	objects[3] = customer.getState();
	        	objects[4] = customer.getZip();
	        	objects[5] = customer.getStreet();
	        	objects[6] = customer.getStreet();
	        	objects[7] = customer.getTotalAmount();
	        	aModel.addRow(objects);
        	}
        	//binding the jtable to the model
              this.viewerTable.setModel(aModel);
              this.getSelectedCustomer();
    }
    
   /* public List getSelectedTableItems(){
        int[] rows = viewerTable.getSelectedRows();
        for(int i=0; i< rows.length; i++){
          viewerTable.getModel().getValueAt(rows[i],0);
        }
      
    	return null;
    }
    */
    
    	
	
}
