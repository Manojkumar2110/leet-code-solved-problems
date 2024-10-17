class Solution {
    public int uniquePathsIII(int[][] grid) {
        int sx=0;
        int sy=0;
        int step=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    sx=i;
                    sy=j;
                }
                if(grid[i][j]==0){
                    step++;
                }
            }
        }
        return dfs(grid,sx,sy,step);
    }
    static int dfs(int[][] grid,int sx,int sy,int step){
        if(sx<0||sy<0||sx>=grid.length||sy>=grid[0].length||grid[sx][sy]==-1){
            return 0;
        }
        if(grid[sx][sy]==2){
            return step<0?1:0;
        }
        step--;
        final int temp=grid[sx][sy];
        grid[sx][sy]=-1;
        int total=dfs(grid,sx+1,sy,step)+dfs(grid,sx,sy+1,step)+dfs(grid,sx-1,sy,step)+dfs(grid,sx,sy-1,step);
        grid[sx][sy]=temp;
        return total;
    }
}