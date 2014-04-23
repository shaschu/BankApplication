
package framework.model;

import java.util.*;

/**
 *  Account class
 */
public abstract class Account  implements IAccount {

    public Account(Customer customer) {
        this.customer = customer;
      
        Random r = new Random();
        this.accountNumber = r.nextInt();
    }

    @Override
    public double getCurrentBalance() {
        return currentBalance;
    }

    public void applyTransaction(Entry e) {
        entries.add(e);
        currentBalance += e.getAmount();
        notifyCustomer(createNotification(e));
    }

    /**
     *
     */
       public abstract String createNotification(Entry e);

    /**
     *
     */
    public void notifyCustomer(String message) {
        if (message != null) {
            customer.sendEmail(message);
        }
    }

    /**
     *
     */
    public abstract String generateMonthlyReport();

    /**
     *
     */
    public void addInterest() {
        double newBalance = currentBalance + (getInterestRate() * currentBalance);
        currentBalance = newBalance;
    }

    /**
     *
     */
    public abstract double getInterestRate();

    
    public abstract String getType();

    /**
     *
     */
    public void setCustomer(Customer cust) {
        this.customer = cust;
    }

    public String getField(String key) {
        return null;
    }

    @Override
    public String toString() {
        return getType();
    }

    private int accountNumber;
    protected Customer customer;
    /**
     *
     */
    private List<Entry> entries = new ArrayList<Entry>();
    /**
     *
     */
    private double currentBalance;
    /**
     *
     */
    public double interest_rate;
   
}
