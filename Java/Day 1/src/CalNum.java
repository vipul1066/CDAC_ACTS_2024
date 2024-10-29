import java.util.Scanner;
public class CalNum{
    public static int num(int a){
        int sum=0;
        while(a>0){
            int last=a%10;
            sum+=last;
            a/=10;
        }
        return sum;
    }
    
    public static int calnum(int a){
        if(a==0){
            return 0;
        }
        else{
            return a%10 + calnum(a/10);
        }
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 4 digit number: ");
		int a = sc.nextInt();

		System.out.println("Using loop sum is: "+ num(a));
		
		System.out.println("Using recurssion sum is: "+calnum(a));
	}
	
}