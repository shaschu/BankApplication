
package framework.controller;

import framework.view.UI;
import java.awt.event.ActionEvent;


public class ExitHandler
        implements EventHandler {

    public ExitHandler() {
    }

    @Override
    public void handle(UI view, FinancialCompany controller, ActionEvent e) {
        System.exit(0);
    }

}
