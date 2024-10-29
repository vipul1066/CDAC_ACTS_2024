import java.util.Scanner;
import java.lang.Math;
public class Interest{
	
	public static int SimpleInt(int p,int r,int t){
	return (p*r*t)/100;
}

	public static double CompInt(double p,double r,double t){
		
		return (p*(Math.pow((1+r/100),t))-p);
	}



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal: ");
		int p = sc.nextInt();
		System.out.print("Enter rate of interest: ");
		int r = sc.nextInt();
		System.out.print("Enter time: ");
		int t = sc.nextInt();
		int ch;
		do{
			System.out.println("1. Calculate Simple interset");
			System.out.println("2. Calculate Compound interset");
			System.out.println("0. exit");
			ch=sc.nextInt();
			switch(ch){
				case 1:{
					System.out.println("Simple interest is: "+ Interest.SimpleInt(p,r,t));
				}break;
				case 2:{
					System.out.println("Compound interest is: "+ Interest.CompInt(p,r,t));
				}break;
				case 0:{
					break;
				}
				default:{
				    System.out.println("You entered wrong choice");
				}
			}
			
		}while(ch!=0);
		
	}
}