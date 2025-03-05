class Solution {
    public long coloredCells(int n) {
       if(n==1){
        return 1;
       }
       int k=4;
       long ans=1;
       for(int i=1;i<n;i++){
        ans+=k;
        k+=4;
       }
       return ans;
    }
}