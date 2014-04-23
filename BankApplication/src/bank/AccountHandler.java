package bank;

import java.awt.event.ActionEvent;

import framework.view.EventHandler;
import framework.controller.FinancialCompany;
import framework.model.Personal;
import framework.view.AccountDialog;
import framework.view.EntryDialog;
import framework.view.UI;

public class AccountHandler implements framework.view.EventHandler {

	
	public AccountHandler(int type) {
		super();
		this.type = type;
	}
	@Override
	public void handle(UI view,  ActionEvent e) {
		// TODO Auto-generated method stub
		 System.out.println("Handler clicked "+type);
		switch (type) {
		
		case personal:
		//	accDialog=	new PersonalAccountDialog("Add Personal Account");
			break;
		case company:
			//accDialog=new CompanyAccountDialog("Add Company Account");
			break;
		case addPersonal:
			actionPerformedforPersonal();
			break;
		case addCompany:
			actionPerformedforCompany();
			break;
		case DepositDialog:
			entryDialog=new DepositDialog("Deposit Amount");
			break;
		case Deposit:
			actionPerformedforDeposit();
			break;
		case WithdrawDialog:
			entryDialog=new WithdrawDialog("Withdraw Amount");
			break;
		case Withdraw:
			actionPerformedforWithdraw();
			break;
		default:
			break;
		}
		
		
		
	}
	
	private void actionPerformedforPersonal()
	{
		/*
		 * TODO : Write add personal info in Database
		 */
	}
	
	private void actionPerformedforCompany()
	{
		/*
		 * TODO : Write add Company info in Database
		 */
	}
	
	private void actionPerformedforDeposit()
	{
		/*
		 * TODO : Write Deposit info in Database
		 */
	}
	
	private void actionPerformedforWithdraw()
	{
		/*
		 * TODO : Write WithDraw info in Database
		 */
	}

	private int type;
	
	public final static int personal=1;
	public final static int company=2;
	public final static int addPersonal=3;
	public final static int addCompany=4;
	public final static int DepositDialog=5;
	public final static int Deposit=6;
	public final static int WithdrawDialog=7;
	public final static int Withdraw=8;
	private AccountDialog accDialog;
	private EntryDialog entryDialog;
	
}
