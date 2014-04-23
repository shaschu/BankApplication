
package bank;

import framework.view.*;
import framework.view.UI;

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
