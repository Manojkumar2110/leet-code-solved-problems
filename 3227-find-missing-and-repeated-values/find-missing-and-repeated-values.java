class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length*grid[0].length;
        int sum=n*(n+1)/2;
        int sum1=0;
        ArrayList<Integer>al=new ArrayList<>();
        int ans[]=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!al.contains(grid[i][j])){
                    al.add(grid[i][j]);
                    sum1+=grid[i][j];
                }
                else{
                    ans[0]=grid[i][j];
                }
            }
        }
        ans[1]=Math.abs(sum-sum1);
        return ans;
    }
}