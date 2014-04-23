/*Factory interface for creating different accounts and entry objects*/

package framework.helper;
import framework.model.*;

public interface IFactory {
  public Account createAccount();
  public Customer createCustomer();
  public Entry createEntry();
}
