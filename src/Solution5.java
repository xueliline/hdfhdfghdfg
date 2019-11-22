public class Solution5 {
    public String longestPalindrome(String s) {
        if(s.length()==0)
            return "";
        int dp[][] = new int[s.length()][s.length()];
        int len=1;
        int maxi = 0;
        int maxj = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            len = 1;
            dp[i][i] = 1;
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                dp[i + 1][i] = 1;
                len = 2;
                maxi = i;
                maxj = i + 1;
            }

        }
        dp[s.length() - 1][s.length() - 1] = 1;
        for (int l = 3; l <= s.length(); l++) {
            for (int i = 0; i + l <= s.length(); i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1;
                    if(j-i+1>len)
                    {

                        maxi = i;
                        maxj = j;
                    }

                }
            }
        }
        return s.substring(maxi, maxj+1);
    }
        public static void main(String[] args) {
        Solution5 solution5=new Solution5();
        solution5.longestPalindrome("ccc");
    }
}
