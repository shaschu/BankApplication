
package bank;

import bank.controller.BankController;
import bank.controller.BankFactory;
import bank.controller.BankTablePane;
import framework.view.*;

public class BankUI extends UI {
    private BankController controller;
    public BankUI(String title) {
        super(title); 
    }
    protected void initComponents(){
    	panel  = new BankTablePane(this);
    	controller = new BankController(panel, new BankFactory());
    	super.initComponents();
    }
    
    public BankController getController(){
    	return controller;
    }
    
}
