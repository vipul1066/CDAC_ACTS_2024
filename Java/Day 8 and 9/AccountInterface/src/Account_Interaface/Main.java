package Account_Interaface;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println("***************Menu*******************");
			System.out.println("1.Open a SavingAccount\n2.Open to CurrentAccount\n3.Open a Depost Account");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				sc.nextLine();
				int Savingcount=0;
				SavingAccount arr[]=new SavingAccount[10];
				System.out.println("Saving Account Openinng");
				System.out.println("Enter the Name");
				String name=sc.nextLine();
				System.out.println("Enter the Amount to added intially");
				int Amount=sc.nextInt();
				arr[++Savingcount]=new SavingAccount(name,Amount);
				System.out.println(arr[Savingcount]);
			case 2:
				
			}
			
		}while(choice!=0);
		sc.close();
		

	}

}
