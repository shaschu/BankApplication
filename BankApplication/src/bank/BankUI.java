
package bank;


import framework.controller.ExitHandler;
import framework.controller.FinancialCompany;
import framework.model.Account;
import framework.model.Customer;
import framework.view.ActionButton;
import framework.view.UI;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class BankUI
        extends UI {

    public BankUI(FinancialCompany l, String title) {
        super(l, title);
    }
    

    @Override
    public JPanel createActions() {
        JPanel actions = new JPanel(new java.awt.GridLayout(6, 1));
        ActionButton addPersonalAccountButton = new ActionButton();
        ActionButton addCompanyAccountButton = new ActionButton();
        ActionButton addInterestButton = new ActionButton();
        ActionButton depositButton = new ActionButton();
        ActionButton withdrawButton = new ActionButton();
        ActionButton exitButton = new ActionButton();

        addPersonalAccountButton.setText("Add Personal Account");
        addPersonalAccountButton.setHandler(new AccountHandler(AccountHandler.personal));
        addPersonalAccountButton.addActionListener(getListener());
        actions.add(addPersonalAccountButton);

        addCompanyAccountButton.setText("Add Company Account");
        addCompanyAccountButton.setHandler(new AccountHandler(AccountHandler.company));
        addCompanyAccountButton.addActionListener(getListener());
         actions.add(addCompanyAccountButton);

        addInterestButton.setText("Add Interest");
        actions.add(addInterestButton);

        depositButton.setText("Deposit");
        depositButton.setHandler(new AccountHandler(AccountHandler.DepositDialog));
        depositButton.addActionListener(getListener());
        actions.add(depositButton);

        withdrawButton.setText("Withdraw");
        withdrawButton.setHandler(new AccountHandler(AccountHandler.WithdrawDialog));
        withdrawButton.addActionListener(getListener());
        actions.add(withdrawButton);

        exitButton.setText("Exit");
        exitButton.setHandler(new ExitHandler());
        exitButton.addActionListener(getListener());
        actions.add(exitButton);

        return actions;
    }

    @Override
    public DefaultTableModel createModel() {
        return new DefaultTableModel(
                new Object[][]{},
                new String[]{
            "Name", "Street", "City", "State", "Zip", "P/C", "Ch/S", "Amount"
        });
    }

    @Override
    public void updateDataModel(Customer c, Account a, DefaultTableModel model) {
        model.addRow(new Object[]{
            c,
            c.getField("street"),
            c.getField("city"),
            c.getField("state"),
            c.getField("zip"),
            c.getType(),
            a,
            a.getCurrentBalance()
        });
    }

    @Override
    public void updateModel() {
        DefaultTableModel m = getModel();
        for (int i = 0; i < m.getRowCount(); i++) {
            Account account = (Account) m.getValueAt(i, 6);
            m.setValueAt(account.getCurrentBalance(), i, 7);
        }
    }

}
