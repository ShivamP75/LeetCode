public class Mock_DSA_easy {
    static int n1 = 0, n2 = 1, sum = 0;
    public static void main(String[] args) {
        int n = 7;
//        System.out.print(n1 + " " + n2);
//        fibSeries(n);
            fib(n);
    }

    private static void fibSeries(int n) {
        if(n > 0){
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print( " " + sum);
            fibSeries(n-1);
        }
    }
    public static void fib(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        for(int i: dp){
            System.out.print(i + " ");
        }
    }
}
