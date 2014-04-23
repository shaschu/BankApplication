/*
 * Data model  interface to store, customer account information
 * and provide functions for other objects perform operations
 * on the accounts
 * */

package framework.model;

import java.util.List;
import framework.helper.*;

public interface IDataModel {
   public void insertEntry(Entry e);
   public void insertAccount(Account a);
   public void insertCustomer(Customer c);
   public Customer getCustomer(int cId);
   public List allCustomers();
   public List allCustomersAccounts(IAction action);
   public List customerAccounts(IAction action);
}
