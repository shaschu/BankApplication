
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
    
    FwController getController(){
    	return controller;
    }

   /* public Object getSelectedCell(int col) {
        int row = viewerTable.getSelectedRow();
        return row == -1 ? null : viewerTable.getValueAt(row, col);
    }

    public String getSelectedCustomer() {
        int row = viewerTable.getSelectedRow();
        return row == -1 ? null : (String) viewerTable.getValueAt(row, 0);
    }
  
    public abstract DefaultTableModel createModel();

    public void updateCell(Object o, int c) {
        viewerTable.setValueAt(o, viewerTable.getSelectedRow(), c);
    }


    public abstract JPanel createActions();

    protected DefaultTableModel getModel() {
        return (DefaultTableModel) viewerTable.getModel();
    }

    public abstract void updateModel();


    public abstract void updateDataModel(Customer c, Account a, DefaultTableModel model);

    public void updateData(Customer c, Account a) {
        updateDataModel(c, a, (DefaultTableModel) viewerTable.getModel());
//        accounts.add(a);
    }
    
    //override the View interface methods

    
    private JPanel actionsPanel;
    private JScrollPane scroller;
    private JTable viewerTable;
    */
    //private FinancialCompany controller;
//    private List<Account> accounts;
}
