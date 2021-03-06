package bank;

import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bank.controller.BankController;
import framework.helper.IAction;
import framework.view.ActionButton;
import framework.view.EntryDialog;
import framework.view.FwActionListener;
import framework.view.UI;

public class WithdrawDialog extends EntryDialog {
	BankController controller;
	public WithdrawDialog(String title,BankController controller) {
		super(title);
		// TODO Auto-generated constructor stub
		this.controller = controller;
	}

	@Override
	public JPanel createActions() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	 	JPanel actions = new JPanel(null);
      
        ActionButton okbButton = new ActionButton();
        okbButton.setText("OK");
        okbButton.addActionListener(new FwActionListener(new IAction(){
        	@Override
			public void performAction() {
        		 String accName = nameField.getText();
	        	   double amount = Double.parseDouble(amountField.getText());
	        	  
	        	   controller.makeWithdrawalTransacation(accName,amount);
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
        
       
        actions.setBounds(60, 100, 200, 20);
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
		nameLabel=new JLabel("Name");
		nameLabel.setBounds(1, 3, 100, 20);
		extra.add(nameLabel);
		
		nameField=new JTextField();
		nameField.setBounds(60, 3, 120, 20);
		extra.add(nameField);
		
		amountLabel=new JLabel("Amount");
		amountLabel.setBounds(1, 30, 100, 20);
		extra.add(amountLabel);
		
		amountField=new JTextField();
		amountField.setBounds(60, 30, 120, 20);
		extra.add(amountField);
		
		extra.setBounds(30, 30, 200, 60);
		return extra;
	}
	
	private JLabel nameLabel;
	private JTextField nameField;
	private JLabel amountLabel;
	private JTextField amountField;

}
