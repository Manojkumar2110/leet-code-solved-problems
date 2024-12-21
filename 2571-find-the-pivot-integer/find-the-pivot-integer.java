class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int ans=-1;
        for(int i=1;i<=n;i++){
            int l=0,r=0;
            for(int j=1;j<i;j++){
                l+=j;
            }
            for(int k=i+1;k<=n;k++){
                r+=k;
            }
            if(l==r){
                ans=i;
                break;
            }
        }
        return ans;
    }
}