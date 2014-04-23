package framework.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bank.PersonalAccountDialog;
import framework.helper.IAction;

public class FwActionListener implements ActionListener{
	IAction action;
    public FwActionListener(IAction action){
	     this.action = action;
    }
	public void actionPerformed(ActionEvent e) {
	         //String command = e.getActionCommand();  
	         System.out.println("Action clicked")	;
	         action.performAction();
	     
	}		
}