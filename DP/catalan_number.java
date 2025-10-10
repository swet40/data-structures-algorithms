public class catalan_number{
    public static int catalan(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        // O(n*n)
        for(int i = 2; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(catalan(n));
    }
}