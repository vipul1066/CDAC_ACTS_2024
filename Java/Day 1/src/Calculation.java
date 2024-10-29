import java.util.Scanner;
public class Calculation{
	public static int add(int a,int b){
		return a+b;
	}
	public static int sub(int a,int b){
		return a-b;
	}
	public static int mul(int a,int b){
		return a*b;
	}
	public static int div(int a,int b){
		return a/b;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a= sc.nextInt();
		System.out.println("Enter second number: ");
		int b= sc.nextInt();
		int n;
		
		do{
			System.out.println("1. Addition of Number");
			System.out.println("2. Substraction of Number");
			System.out.println("3. Multiplication of Number");
			System.out.println("4. Division of Number");
			System.out.println("0. Exit");
			System.out.println("Enter Your choice ");
			 n= sc.nextInt();
			
			switch(n){
				case 1:{
					System.out.println(Calculation.add(a,b));
				}break;
				case 2:{
					System.out.println(Calculation.sub(a,b));
				}break;
				case 3:{
					System.out.println(Calculation.mul(a,b));
				}break;
				case 4:{
					System.out.println(Calculation.div(a,b));
				}break;
				case 0:{
					break;
				}
				default:{
				    System.out.println("You entered wrong choice");
				}
			}
				
			}
			while(n!=0);
			
			
		
}}