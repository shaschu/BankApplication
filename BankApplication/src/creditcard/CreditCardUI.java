
package creditcard;

import creditcard.controller.CreditCardController;
import creditcard.controller.CreditCardFactory;
import creditcard.controller.CreditCardTablePane;
import framework.view.*;

public class CreditCardUI extends UI {
    private CreditCardController controller;
    public CreditCardUI(String title) {
        super(title); 
    }
    protected void initComponents(){
    	panel  = new CreditCardTablePane(this);
    	controller = new CreditCardController(panel, new CreditCardFactory());
    	super.initComponents();
    }
    
    public CreditCardController getController(){
    	return controller;
    }
    
}
