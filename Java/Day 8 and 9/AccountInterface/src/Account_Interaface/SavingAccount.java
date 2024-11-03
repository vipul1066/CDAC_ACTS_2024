package Account_Interaface;

public abstract  class SavingAccount implements Withdraw,Depos {
	
	private static final int Amount = 0;
	double balance;
	int Rate = 4; 
	
}

@Override
SavingAccount(String name,int IntialAmount)
{
	this();
	this.Name=name;
	Amount=IntialAmount;
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
