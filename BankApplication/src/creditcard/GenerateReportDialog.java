package creditcard;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import creditcard.controller.CreditCardController;
import framework.helper.IAction;
import framework.view.ActionButton;
import framework.view.EntryDialog;
import framework.view.FwActionListener;

public class GenerateReportDialog extends EntryDialog {

	private CreditCardController controller;
	public GenerateReportDialog(String title, CreditCardController controller) {
		super(title);
		// TODO Auto-generated constructor stub
		this.controller = controller;
		super.setSize(300, 300);
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
//	        	   String accName = nameField.getText();
//	        	   double amount = Double.parseDouble(amountField.getText());
//	        	  
//	        	   controller.makeDepositTransacation(accName,amount);
	        	   cancel();
			}	
    	}));
        okbButton.setBounds(1, 1, 80, 20);
        actions.add(okbButton);
        
        actions.setBounds(80, 230, 200, 20);
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
		billArea=new JTextArea();
		billArea.setBounds(1, 3, 200, 200);
		extra.add(billArea);
		
		extra.setBounds(30, 10, 200, 200);
		return extra;
	}
	
	private JTextArea billArea;

}
