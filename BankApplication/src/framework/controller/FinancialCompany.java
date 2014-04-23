
package framework.controller;

import framework.model.Customer;
import framework.view.ActionButton;
import framework.view.UI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public abstract class FinancialCompany
        implements ActionListener {

    public FinancialCompany() {
        customers = new ArrayList<Customer>();
    }

    public void setView(UI view) {
        this.view = view;
        this.view.setVisible(true);

    }

    /**
     *
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.equals(name)) {
                return customer;
            }
        }
        return null;
    }

  
    public boolean isCustomerExists(String name) {
        for (Customer customer : customers) {
            if (customer.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        EventHandler action = ((ActionButton) e.getSource()).getHandler();
        action.handle(view, this, e);
    }

    protected List<Customer> customers;
    private UI view;
}
