
package framework.controller;

import framework.view.UI;
import java.awt.event.ActionEvent;


public interface EventHandler {

    public void handle(UI view, FinancialCompany controller, ActionEvent e);

}
