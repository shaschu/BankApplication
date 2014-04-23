
package framework.view;

import framework.controller.FinancialCompany;
import framework.model.Account;
import framework.model.Customer;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public abstract class UI extends JFrame implements IView{

    public UI(FinancialCompany l, String title) {
        super(title);
        this.controller = l;
        initComponents();
    }

    private void initComponents() {
        scroller = new JScrollPane();
        viewerTable = new JTable();
        actionsPanel = createActions();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        viewerTable.setModel(createModel());
        viewerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scroller.setViewportView(viewerTable);

        getContentPane().add(scroller, java.awt.BorderLayout.CENTER);
        getContentPane().add(actionsPanel, java.awt.BorderLayout.EAST);

        setSize(700, 300);
    }

    public ActionListener getListener() {
        return controller;
    }

    public Object getSelectedCell(int col) {
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

    /**
     *
     */
    public abstract JPanel createActions();

    protected DefaultTableModel getModel() {
        return (DefaultTableModel) viewerTable.getModel();
    }

    public abstract void updateModel();

    /**
     *
     *
     */
    public abstract void updateDataModel(Customer c, Account a, DefaultTableModel model);

    public void updateData(Customer c, Account a) {
        updateDataModel(c, a, (DefaultTableModel) viewerTable.getModel());
//        accounts.add(a);
    }
    
    /***********************************************************/
    //override the View interface methods
    public void updateView(){
    	
    }
    
    private JPanel actionsPanel;
    private JScrollPane scroller;
    private JTable viewerTable;
    private FinancialCompany controller;
//    private List<Account> accounts;
}
