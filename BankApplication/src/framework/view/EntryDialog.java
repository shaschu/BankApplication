package framework.view;

/*
 * abstract class in Fraework for show the GUI of Withdraw Account and Deposit Account
 */

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import framework.controller.FinancialCompany;

public abstract class EntryDialog extends JFrame {

	
	  private JPanel actionsPanel;
	  private JPanel extraFields;
      private FinancialCompany controller;
	
      public EntryDialog(FinancialCompany l, String title) {
          super(title);
          this.controller = l;
          initComponents();
      }

      private void initComponents() {
         
          actionsPanel = createActions();
          extraFields=extraFields();
          
          getContentPane().setLayout(null);
         
    
          getContentPane().add(extraFields);
          
          
          getContentPane().add(actionsPanel);
          

          setSize(300, 200);
          setVisible(true);
      }
      
      public abstract JPanel createActions();
      public abstract JPanel extraFields();
      
      public ActionListener getListener() {
          return controller;
      }
      
      
      
}

