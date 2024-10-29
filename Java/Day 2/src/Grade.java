import java.util.Scanner;
public class Grade{
	
	public static void main(String[] areg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your percentage: ");
		int grade= sc.nextInt();
		if(grade<40 && grade>0){
			System.out.println("fail");
		}
		else if(grade>40 && grade<=50){
			System.out.println("Pass");
		}
		else if(grade>50 && grade<=60){
			System.out.println("Second class");
		}
		else if(grade>60 && grade<=75){
			System.out.println("First class");
		}
		else if(grade>75 && grade<=100){
			System.out.println("Distinction");
		}
		else{
			System.out.println("You entered wrong input!!");
		}
		
	}
}