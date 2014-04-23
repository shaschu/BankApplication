
package framework.model;

import java.util.Calendar;
import java.util.Date;


public class Entry
        implements IEntry {

    public Entry(double amount) {
        this.amount = amount;
        this.date = Calendar.getInstance().getTime();
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double a) {
        this.amount = a;
    }

    /**
     *
     */
    private double amount;
    /**
     *
     */
    private Date date;
}
