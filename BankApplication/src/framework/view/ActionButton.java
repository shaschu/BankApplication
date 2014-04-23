package framework.view; 

import javax.swing.JButton;

import bank.AccountHandler;

public class ActionButton
        extends JButton {

    public ActionButton() {
    }

    public ActionButton(String text) {
        super(text);
    }

    public void setHandler(EventHandler eventHandler) {
      //  this.handler = accountHandler;
    }

    public EventHandler getHandler() {
        return handler;
    }

    private EventHandler handler;
}
