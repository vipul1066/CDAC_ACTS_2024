import java.util.Scanner;

public class Factorial{

public static int fact(int n){
	if(n==0 || n==1){
		return 1;
}
	return n* fact(n-1);

	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++){
				System.out.print(Factorial.fact(i)+ " ");
			}
			
			
	}
}