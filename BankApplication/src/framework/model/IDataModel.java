/*
 * Data model  interface to store, customer account information
 * and provide functions for other objects perform operations
 * on the accounts
 * */

package framework.model;

import java.util.List;
import java.util.Observable;

import framework.helper.*;

public abstract class IDataModel extends Observable{
   public abstract void insertEntry(int accNumber,Entry entry);
   public abstract void insertEntry(String accName,Entry entry);
   public abstract void insertAccount(int cusNumber,Account account);
   public abstract void insertCustomer(Customer customer);
   public abstract Customer getCustomer(int cusNumber);
   public abstract List<Customer> allCustomers();
   public abstract List<Account> allCustomersAccounts(IAction action);
   public abstract List<Account> customerAccounts(int custNumber,IAction action);
}

