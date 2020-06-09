class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int l = 0, h = n/2;
        
        while(l<=h)
        {
            int m = (l + h)/2;
            
            if( Math.pow(2,m) == n )return  true ;
            else if(Math.pow(2,m) < n )l = m + 1 ;
            else
                h  = m -1 ;
            
        }
        return false;
    }
}