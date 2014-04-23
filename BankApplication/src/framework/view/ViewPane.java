package framework.view;

import java.util.Observer;

import javax.swing.JPanel;

public abstract class ViewPane extends JPanel implements Observer,ITable{
	protected static UI parentWindow;
	public ViewPane(){
		super();
	}
	public ViewPane(UI parentWindow){
		this.parentWindow = parentWindow;
	}
	
	public void setParentWindow(UI parentWindow){
		this.parentWindow = parentWindow;
	}
    public abstract void render();
    public abstract JPanel createActions();
    
}
