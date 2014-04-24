package creditcard;

import java.awt.event.ActionEvent;
import java.sql.Savepoint;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import framework.helper.IAction;
import framework.view.AccountDialog;
import framework.view.ActionButton;
import framework.view.FwActionListener;
import framework.view.UI;
import framework.controller.*;
public class PersonalCCAccountDialog extends AccountDialog {
    CreditCardController controller;
	public PersonalCCAccountDialog( String title,CreditCardController controller) {
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
	        	          ccNumber = ccNumberField.getText(),
	        	          accType=groupJButtons.getSelection().getActionCommand();
	        	    
	        	  // System.out.println("cont" + controller);
	        	   controller.addPersonalAccount(name, street, city, state, zip, email, ccNumber,accType);
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
	        
	       
	        actions.setBounds(70, 230, 200, 20);
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
		ccNumberLabel=new JLabel("CC Number");
		ccNumberLabel.setBounds(1, 3, 100, 20);
		extra.add(ccNumberLabel);
		
		ccNumberField=new JTextField();
		ccNumberField.setBounds(60, 3, 120, 20);
		extra.add(ccNumberField);
		
		expDateLabel=new JLabel("Exp Date");
		expDateLabel.setBounds(1, 25, 100, 20);
		extra.add(expDateLabel);
		
		expDateField=new JTextField();
		expDateField.setBounds(60, 25, 120, 20);
		extra.add(expDateField);
		
		extra.setBounds(19, 180, 200, 45);
		return extra;
	}
	
	private JLabel ccNumberLabel;
	private JTextField ccNumberField;
	
	private JLabel expDateLabel;
	private JTextField expDateField;
	private JRadioButton goldButton;
	private JRadioButton silverButton;
	private JRadioButton bronzeButton;
	private ButtonGroup groupJButtons;
	
	@Override
	public JPanel optionButtons() {
		// TODO Auto-generated method stub
		JPanel optionButtons=new JPanel(null);
		
		goldButton=new JRadioButton("Gold");
		goldButton.setBounds(20, 0, 100, 20);
		goldButton.setSelected(true);
      
		silverButton=new JRadioButton("Silver");
		silverButton.setBounds(20, 20, 100, 20);
		
		bronzeButton=new JRadioButton("Bronze");
		bronzeButton.setBounds(20, 40, 100, 20);
		
		goldButton.setActionCommand("3");
		silverButton.setActionCommand("4");
		bronzeButton.setActionCommand("5");
		
      
	      groupJButtons = new ButtonGroup();
	      groupJButtons.add(goldButton);
	      groupJButtons.add(silverButton);
	      groupJButtons.add(bronzeButton);
	      
	      optionButtons.add(goldButton);
	      optionButtons.add(silverButton);
	      optionButtons.add(bronzeButton);
	      
	      optionButtons.setBounds(18, 1, 100, 58);
			
			return optionButtons;
	}
}
