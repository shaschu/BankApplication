
package framework.view;

import framework.controller.EventHandler;
import javax.swing.JButton;


public class ActionButton
        extends JButton {

    public ActionButton() {
    }

    public ActionButton(String text) {
        super(text);
    }

    public void setHandler(EventHandler handler) {
        this.handler = handler;
    }

    public EventHandler getHandler() {
        return handler;
    }

    private EventHandler handler;
}
