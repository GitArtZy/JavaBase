package com.training;

public class NumIslands {
	/**
	 * 给一个01矩阵，求不同的岛屿的个数。
	 *0代表海，1代表岛，如果两个1相邻 
     *那么这两个1属于同一个岛。我们只考虑上下左右为相邻。
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    public int numIslands(boolean[][] grid) {
        // Write your code here
        int m =grid.length;
        if(m==0){
            return 0;
        }
        int count =0;
        int n =grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==true){
                    dfs(grid,i,j); 
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(boolean[][]grid,int i,int j){
        if(i<0 || j<0||i>=grid.length || j>=grid[0].length)
            return ;
        if(grid[i][j]==true){
            grid[i][j]=false;
            dfs(grid,i+1,j);
            dfs(grid,i,j+1);
            dfs(grid,i-1,j);
            dfs(grid,i,j-1);
        }
    
    }

}
