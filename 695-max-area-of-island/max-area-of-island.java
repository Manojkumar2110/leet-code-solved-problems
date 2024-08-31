class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxarea=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                int area=dfs(grid,i,j);
                maxarea=Math.max(maxarea,area);
                }
            }
        }
        return maxarea;
    }
    static int dfs(int[][] arr,int row,int col){
        if(row<0||col<0||row>=arr.length||col>=arr[0].length||arr[row][col]==0){
            return 0;
        }
        
        arr[row][col]=0;
        int area=1;
        area+=dfs(arr,row+1,col);
        area+=dfs(arr,row-1,col);
        area+=dfs(arr,row,col+1);
        area+=dfs(arr,row,col-1);
        return area;
    }
}