/*Factory interface for creating different accounts and entry objects*/

package framework.helper;
import framework.model.*;
import framework.view.ViewPane;

public interface IFactory {
  public Account createAccount();
  public Customer createCustomer();
  public Entry createEntry(double amount);
  public IDataModel createDataModel();
  public Account createAccount(String accType);
}
