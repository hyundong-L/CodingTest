import java.util.Scanner;

public class Main {
    public static int tile(int n) {
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
            
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(tile(n));
    }
}
