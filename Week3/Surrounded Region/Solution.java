class Solution {
    public void solve(char[][] board) {
        
        if( board.length == 0)  return ; 
        
        boolean[][] visited = new  boolean[board.length][board[0].length];
        Queue<int[]> q = new LinkedList<int[]>();
        
        for(int i = 0;i<board.length;i++)
        {
            if(board[i][0] == 'O')
            {
                q.add(new int[]{i,0});
                visited[i][0] = true;
            }
            if(board[i ][board[0].length - 1] == 'O')
            {
                visited[i][board[0].length - 1] = true;
                q.add(new int[]{i,board[0].length - 1 });
            }
        }
        
        for(int j=0;j<board[0].length;j++)
        {
            
            if(board[0][j] == 'O')
            {
                visited[0][ j] = true;
                q.add(new int[]{0,j});
            }
            if(board[board.length-1][j] == 'O') 
            {
                visited[board.length-1][j] = true;
                q.add(new  int[]{board.length-1,j});
            }
        }
        while( !q.isEmpty())
        {

            int size = q.size();
            for(int i=1;i<=size;i++)
            {   
                int[] curr = q.poll ();
                
                // System.out.println( curr[0]+"   " + curr[1]);

                int[][] dirs =  { {-1,0},{1,0},{0,-1}, {0,1 } } ;
                
                for(int[] dir : dirs )
                {
                    int x = curr[0] + dir[0];
                    int y = curr[1] + dir[1];
                    
                    if(x>=0 && y>=0  && x < board.length && y< board[0].length  &&  board[x][y] == 'O'   && !visited[x][y])
                    {
                        // System.out.println(x+" , "+y);
                        visited[x][y] = true;
                        q.add(new int [] {x,y}) ; 
                    }
                }
                
            }
            // System.out.println("=============" ) ;
        }
        
        
        
        for(int i=1;i<  board.length - 1;i++)
        {
            for(int j = 1;j< board[0].length - 1; j++)
            {
                if(board[i][j]  == 'O' && !visited[i][j])board[i][j] =  'X';
                
            }
        }
        
    }
}