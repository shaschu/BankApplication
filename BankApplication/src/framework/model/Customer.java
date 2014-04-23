
/*
 * Customer.java
 * 8/13/2013
 */
package framework.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer implements ICustomer {

    public Customer(String name, String email, String street, String city, String state, String zip) {
        this.name = name;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.accounts = new ArrayList<Account>();
    }

    /**
     *
     */
    public void addAccount(Account a) {
        accounts.add(a);
    }

    /**
     *
     */
    public void removeAccount(Account a) {
        accounts.remove(a);
    }

    /**
     *
     */
    public void sendEmail(String message) {
        System.out.println("message sent: " + message);
    }

    /**
     *
     */
    public String generateAccountsReport() {
        StringBuilder sb = new StringBuilder();
        for (Account account : accounts) {
            sb.append(account.generateMonthlyReport()).append('\n');
        }
        return sb.toString();
    }

    public String getField(String key) {
        if ("name".equals(key)) {
            return name;
        } else if ("street".equals(key)) {
            return street;
        } else if ("city".equals(key)) {
            return city;
        } else if ("zip".equals(key)) {
            return zip;
        } else if ("state".equals(key)) {
            return state;
        } else {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof String && ((String) o).equals(name)) {
            return true;
        }
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String email;
    /**
     *
     */
    private String street;
    /**
     *
     */
    private String city;
    /**
     *
     */
    private String state;
    /**
     *
     */
    private String zip;
    private List<Account> accounts;

    public void addInterest() {
        for (Account account : accounts) {
            account.addInterest();
        }
    }

    public abstract String getType();

    @Override
    public String toString() {
        return name;
    }
}
