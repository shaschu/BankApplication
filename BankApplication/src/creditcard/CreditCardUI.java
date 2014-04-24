
package creditcard;

import framework.view.*;
import framework.view.UI;

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
