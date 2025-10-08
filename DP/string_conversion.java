public class string_conversion {
    public static void conversion(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];

        //initialization
        for(int i =0; i<=n; i++) dp[i][0] = i;
        for(int j = 0; j<=m; j++) dp[0][j] = j;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                } else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        int i=n, j=m;
        int deletions = 0, insertions = 0;
        while(i>0 && j>0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                i--; j--;
            }else if(dp[i][j] == dp[i-1][j]+1){
                deletions++;i--;
            }else{
                insertions++;
                j--;
            }
        }
        deletions +=1;
        insertions += 1;

        System.out.println("Min operations (insert/delete): " + dp[n][m]);
        System.out.println("Deletions: "+deletions );
        System.out.println("Insertions: " + insertions);
    }
    public static void main(String[] args) {
        String word1 = "pear";
        String word2 = "sea";

        conversion(word1, word2);
    }
}
