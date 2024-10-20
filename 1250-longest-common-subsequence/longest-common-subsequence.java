class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int a1=text1.length();
        int b1=text2.length();
        int dp[][]=new int[a1+1][b1+1];
        for(int i=1;i<=a1;i++){
            for(int j=1;j<=b1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[a1][b1];
    }
}