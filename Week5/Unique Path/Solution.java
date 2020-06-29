class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][ m ];
        num_paths(0,0,n,m,dp);
    
        dp[n-1][m-1] = 1;
        
        return dp[0][0] ;
    }
    
    int num_paths(int r,int c,int n,int m,int[][]  dp){
        if(r<0 || c < 0 || r >= n || c >= m ) return 0;
        
        
        if(r == n-1 && c == m-1)return 1;
        
        if(dp[r][c]!=0)return dp[r][c];
        
        dp[r][c] = num_paths(r,c+1,n,m, dp ) + num_paths(r+1,c,n,m,dp);
        
        return dp[r][c];
    }
    
}