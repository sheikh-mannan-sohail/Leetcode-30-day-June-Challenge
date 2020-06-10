class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int l = 0, h = nums.length - 1;
        
        while(l <= h)
            
        {
            int m = l + (h - l) /2  ; 
            if(nums[m] == target || (m > 0 && nums[m-1]<target && nums[m] > target)) return  m;
            else if(nums[m] > target)
                h = m-1;
            else
                l = m + 1;
            
        }
        if( h < 0) return 0;
        return  nums.length ; 
        
    }
}