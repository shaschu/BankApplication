package bank;

import java.awt.event.ActionEvent;
import java.sql.Savepoint;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import framework.helper.IAction;
import framework.view.AccountDialog;
import framework.view.ActionButton;
import framework.view.FwActionListener;
import framework.view.UI;
import framework.controller.*;
public class PersonalAccountDialog extends AccountDialog {
    BankController controller;
	public PersonalAccountDialog( String title,BankController controller) {
		super(title,controller);
		// TODO Auto-generated constructor stub
        this.controller = controller;
	}

	@Override
	public JPanel createActions() {
		// TODO Auto-generated method stub
		 	JPanel actions = new JPanel(null);
	      
	        ActionButton okbButton = new ActionButton();
	        okbButton.setText("OK");
	        okbButton.addActionListener(new FwActionListener(new IAction(){
	        	@Override
				public void performAction() {
	        	    String name =  namefField.getText(),
	        	          street = streetField.getText(),
	        	          city  =  cityField.getText(),
	        	          state =  stateField.getText(),
	        	          zip   =  zipField.getText(),
	        	          email =  emailField.getText(),
	        	          birthdate = bodField.getText(),
	        	          accType=groupJButtons.getSelection().getActionCommand();
	        	    
	        	  // System.out.println("cont" + controller);
	        	   controller.addPersonalAccount(name, street, city, state, zip, email, birthdate,accType);
	        	   cancel();
				}	
	    	}));
	        okbButton.setBounds(1, 1, 80, 20);
	        actions.add(okbButton);
	          
	        ActionButton cancelButton = new ActionButton();    
	      
	        cancelButton.setText("Cancel");
	        cancelButton.addActionListener(new FwActionListener(new IAction(){
	        	@Override
				public void performAction() {
	        		cancel();
				}	
	    	}));
	        cancelButton.setBounds(80, 1, 80, 20);
	        actions.add(cancelButton);
	        
	       
	        actions.setBounds(60, 220, 200, 20);
	        return actions;
	}
	
	private void cancel()
	{
		this.dispose();
	}

	@Override
	public JPanel extraFields() {
		// TODO Auto-generated method stub
		JPanel extra = new JPanel(null);
		bodLabel=new JLabel("BirthDate");
		bodLabel.setBounds(1, 3, 100, 20);
		extra.add(bodLabel);
		
		bodField=new JTextField();
		bodField.setBounds(60, 3, 120, 20);
		extra.add(bodField);
		
		extra.setBounds(19, 180, 200, 30);
		return extra;
	}
	
	private JLabel bodLabel;
	private JTextField bodField;

}
