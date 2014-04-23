/*Factory interface for creating different accounts and entry objects*/

package framework.helper;
import framework.model.*;

public abstract  class AFactory {
 // public abstract Account createAccount();
  public abstract Customer createPersonalCustomer(String name, String street, String  city,
		                                          String state, String zip, String email,String birthdate);
  public abstract Customer createCompanyCustomer(String name, String street, String  city, String state, 
		                                         String zip, String email, int numOfEmps);
  public abstract Entry createEntry(double amount);
}
