class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        Arrays.sort(costs,new Comparator<int[]>(){
           
            public int  compare(int[] cost1,int[]  cost2)
            {
                return cost1[0] -  cost2[0];
            }
            
        });
        
        
        int res = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            
        }
        
        System.out.print(Arrays.deepToString(costs));
        return 1;
    }
}