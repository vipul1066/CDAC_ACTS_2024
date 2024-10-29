public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
		System.out.println("Pattern 1");
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
