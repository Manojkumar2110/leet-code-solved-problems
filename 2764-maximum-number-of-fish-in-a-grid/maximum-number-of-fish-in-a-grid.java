class Solution {
    public int findMaxFish(int[][] grid) {
         if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    int max=dfs(grid,i,j);
                    ans=Math.max(max,ans);
                }
            }
        }
        return ans;
    }
    private int dfs(int grid[][],int row,int col){
        int a=0;
        if(row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]==0){
            return 0;
        }
        a+=grid[row][col];
        grid[row][col]=0;
        a+=dfs(grid,row+1,col);
        a+=dfs(grid,row-1,col);
        a+=dfs(grid,row,col+1);
        a+=dfs(grid,row,col-1);
        return a;
    }
}