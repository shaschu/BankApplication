package creditcard;

import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import creditcard.controller.CreditCardController;
import framework.helper.IAction;
import framework.model.Customer;
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
		generatebill();
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
	
	private void generatebill()
	{
		Iterator<Customer> cusIterator=controller.getCustomer().iterator();
		while(cusIterator.hasNext())
		{
			Customer cus=cusIterator.next();
			billArea.append("Name : "+cus.getName()+"\n");
			billArea.append("Address : "+cus.getStreet()+" "+cus.getCity()+" "+cus.getState()+"\n");
			billArea.append("CC Number : "+cus.getCcNumber()+"\n");
			if(cus.getType().equals("3"))
				billArea.append("CC Type : Gold"+"\n");
			if(cus.getType().equals("4"))
				billArea.append("CC Type : Silver"+"\n");
			if(cus.getType().equals("5"))
				billArea.append("CC Type : Bronze"+"\n");
			billArea.append("Balance : "+cus.getTotalAmount()+"\n\n\n");
		}
	}
	
	private void cancel()
	{
		this.dispose();
	}
	@Override
	public JPanel extraFields() {
		// TODO Auto-generated method stub
		JPanel extra = new JPanel(null);
		scroller=new JScrollPane();
		billArea=new JTextArea();
		
		scroller.setViewportView(billArea);
		scroller.setBounds(1, 3, 200, 200);
		extra.add(scroller);
		
		extra.setBounds(30, 10, 200, 200);
		return extra;
	}
	
	private JTextArea billArea;
	private  JScrollPane scroller;

}
