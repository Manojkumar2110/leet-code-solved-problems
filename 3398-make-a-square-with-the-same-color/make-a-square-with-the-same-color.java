class Solution {
    public boolean canMakeSquare(char[][] grid) {
        return check(grid,0,0)||check(grid,0,1)||check(grid,1,0)||check(grid,1,1);
    }
    static boolean check(char grid[][],int x,int y){
        char color[]={grid[x][y],grid[x][y+1],grid[x+1][y],grid[x+1][y+1]};
        int black=0;
        int white=0;
        for(char c:color){
            if(c=='B'){
                black++;
            }
            else{
                white++;
            }
        }
        return black>=3||white>=3;
    }
}