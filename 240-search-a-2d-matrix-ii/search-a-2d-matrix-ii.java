class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int st=0;
        int end=matrix[0].length-1;
        while(st<matrix.length&&end>=0){
            if(matrix[st][end]==target){
                return true;
            }
            else if(matrix[st][end]<target){
                st++;
            }
            else if(matrix[st][end]>target){
                end--;
            }
        }
        return false;
    }
}