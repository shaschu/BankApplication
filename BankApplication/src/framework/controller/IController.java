package framework.controller;

import framework.helper.IAction;

/* Controller interface */
public interface IController {
  public void listAccounts(IAction action);
  public void listCustomerAccounts(int custNumber, IAction action);
}
