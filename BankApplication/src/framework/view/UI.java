
package framework.view;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import framework.controller.FwController;

public abstract class UI extends JFrame{
    protected ViewPane panel;
    protected int height = 700,width = 400;
    protected FwController controller;
    
    public UI( String title) {
        super(title);
        initComponents();
    }
    
    public UI( String title , ViewPane panel) {
        super(title);
        this.panel = panel;
        initComponents();
    }

    public void render(){
    	initComponents();
    	
    }
    protected void initComponents() {       	
	   setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setSize(height,width);
       panel.render();
    }

    public void setPane(ViewPane panel){
    	this.panel = panel;
    }
    
    public FwController getController(){
    	return controller;
    }
}
