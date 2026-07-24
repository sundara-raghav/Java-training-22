import java.util.*;

class Fibo {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        
        System.out.println(Dp(dp, n));
    }
    static int Dp(int[] dp, int n) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = Dp(dp, n - 1) + Dp(dp, n - 2);
    }
}
