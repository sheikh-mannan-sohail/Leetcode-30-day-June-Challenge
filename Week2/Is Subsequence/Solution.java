class Solution {
    public boolean isSubsequence(String s, String t) {
     
        if(s.length()>t.length())
            return  false;
        
        int[][] dp = new int[s.length() + 1][t.length() +1];
        
        int max_subseq_len = 0;
        
        for(int i=0;i<=s.length();i++)
        {
            for(int j=0;j<=t.length();j++)
            {
                
                if(i == 0 || j==0 )
                {
                    dp[i][j] = 0;
                    continue;
                }
                
                
                if(s.charAt(i -1) == t.charAt(j -1 ))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else
                    dp[i][j] =  Integer.max(dp[i][j-1],dp[i-1][j]);
                max_subseq_len  = Integer.max(dp[i][j], max_subseq_len);
            }
        }
        
        if(max_subseq_len == s.length())return true;
        return false;
    }
}