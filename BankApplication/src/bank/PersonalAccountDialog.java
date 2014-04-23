package bank;

import java.awt.event.ActionEvent;
import java.sql.Savepoint;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import framework.controller.EventHandler;
import framework.controller.ExitHandler;
import framework.controller.FinancialCompany;
import framework.view.AccountDialog;
import framework.view.ActionButton;
import framework.view.UI;

public class PersonalAccountDialog extends AccountDialog {

	public PersonalAccountDialog(FinancialCompany l, String title) {
		super(l, title);
		// TODO Auto-generated constructor stub

	}

	@Override
	public JPanel createActions() {
		// TODO Auto-generated method stub
		 	JPanel actions = new JPanel(null);
	      
	        ActionButton okbButton = new ActionButton();
	        okbButton.setText("OK");
	        okbButton.setHandler(new AccountHandler(AccountHandler.addPersonal));
	        okbButton.addActionListener(getListener());
	        okbButton.setBounds(1, 1, 80, 20);
	        actions.add(okbButton);
	        
	        
	        ActionButton cancelButton = new ActionButton();
	        
	      
	        cancelButton.setText("Cancel");
	        cancelButton.setHandler(new EventHandler() {
				
				@Override
				public void handle(UI view, FinancialCompany controller, ActionEvent e) {
					// TODO Auto-generated method stub
					cancel();
				}
			});
	        cancelButton.addActionListener(getListener());
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
