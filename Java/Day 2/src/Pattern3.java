import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
            if (i == 0) {
                for (int j = 0; j < 7; j++) {
                    System.out.print("*");
                }
            }
            else if (i == 1) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
                System.out.print(" ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
            }
            else if (i == 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 3; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2; j++) {
                    System.out.print("*");
                }
            }
            else if (i == 3) {
                System.out.print("*");
                for (int j = 0; j < 5; j++) {
                    System.out.print(" "); 
                }
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
