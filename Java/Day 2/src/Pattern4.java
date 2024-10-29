import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		 for (int i = 0; i < n; i++) {
            if (i == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            } else if (i == 1) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
            } else if (i == 2) {
                System.out.print("*");
            } else if (i == 3) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
            } else if (i == 4) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
