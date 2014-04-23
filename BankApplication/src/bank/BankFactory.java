
package bank;

import javax.swing.JFrame;

import framework.helper.*;
import framework.model.*;
import framework.view.UI;
import framework.view.ViewPane;

public class BankFactory extends FwFactory{

 @Override
 public IDataModel createDataModel()
 {
	 return new DataModel();
 }

@Override
public ViewPane defaultPane(UI parentWindow) {
	// TODO Auto-generated method stub
	return null;//new BankTablePane(parentWindow);
  }
}
