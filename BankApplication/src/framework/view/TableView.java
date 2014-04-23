package framework.view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public abstract class TableView  extends ViewPane{
    private JPanel actionsPanel;
    private JScrollPane scroller;
    protected JTable viewerTable;
    
    public TableView(){
    	super();
    }
	public TableView(UI parentWindow) {
		super(parentWindow);
	}

    public ActionListener getListener() {
        return null;//controller;
    }

    public Object getSelectedCell(int col) {
        int row = viewerTable.getSelectedRow();
        return row == -1 ? null : viewerTable.getValueAt(row, col);
    }

    public String getSelectedCustomer() {
        int row = viewerTable.getSelectedRow();
        return row == -1 ? null : (String) viewerTable.getValueAt(row, 0);
    }

    public  abstract DefaultTableModel createModel();

    public void updateCell(Object o, int c) {
        viewerTable.setValueAt(o, viewerTable.getSelectedRow(), c);
    }

    protected DefaultTableModel getModel() {
        return (DefaultTableModel) viewerTable.getModel();
    }

    
    /***********************************************************/
    //override the View interface methods
    public void updateView(){
    	
    }    

	@Override
	public void render() {
	   scroller = new JScrollPane();
       viewerTable = new JTable();
       actionsPanel = createActions();
       
       viewerTable.setModel(createModel());
       viewerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
       scroller.setViewportView(viewerTable);

       parentWindow.getContentPane().add(scroller, java.awt.BorderLayout.CENTER);
       parentWindow.getContentPane().add(actionsPanel, java.awt.BorderLayout.EAST);
	}

	public abstract JPanel createActions();

}
