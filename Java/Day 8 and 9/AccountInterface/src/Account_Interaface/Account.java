package Account_Interaface;

import java.util.Date;

public abstract class Account  {
	int AccountNo;
	String Name;
	Date DateOfopening;
	int Amount;
	private static int AccountGenerator=1000;
	public Account()
	{
		this.AccountNo=++AccountGenerator;
		Name="";
		Amount=0;
		DateOfopening=new Date();
		System.out.println("The parent Class constructor is called");
	}
	public Account (String AholderName,int Addamount)
	{
		Name=AholderName;
		Amount=Addamount;
	}
	abstract double ApplyInterest();
}
//public class SavingAccount extends Account implements Withdraw,Depos 
//{
//	int Rate;
//	SavingAccount()
//	{
//		Rate=3;
//		System.out.println("The constructor of savingaccount is called");
//	}
//	SavingAccount(String name,int IntialAmount)
//	{
//		this();
//		this.Name=name;
//		Amount=IntialAmount;
//	}
//	double ApplyInterest()
//	{
//		double  Interest=(Amount*Rate)/100;
//		double totalAmount=Amount+Interest;
//		return totalAmount;
//	}
//	 public String toString()
//	 {
//		 return "Amount is:"+ApplyInterest();
//	}
//	
//}
class CurrentAccount extends Account
{
	int Rate;
	CurrentAccount()
	{
		Rate=1;
	}
	double ApplyInterest()
	{
		double  Interest=(Amount*Rate)/100;
		double totalAmount=Amount+Interest;
		return totalAmount;
	}
	public String toString()
	 {
		 return "Amount is:"+ApplyInterest();
	}
}
class Depost extends Account  implements Withdraw,Depos
{
	int Rate;
	Depost(String name,int IntialAmount)
	{
		Rate=8;
	}
	double ApplyInterest()
	{
		double  Interest=(Amount*Rate)/100;
		double totalAmount=Amount+Interest;
		return totalAmount;
	}
	public String toString()
	 {
		 return "Amount is:"+ApplyInterest();
	}
	@Override
	public double depoist() {
		// 
		return 0;
	}
	@Override
	public double WithdrawAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}