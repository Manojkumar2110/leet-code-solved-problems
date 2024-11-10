class Solution {
    public int arrangeCoins(int n) {
        int k=1;
        int ans=0;
        while(n>0){
            if(n<k){
                break;
            }
            n-=k;
            ans++;
            k++;
        }
        return ans;
    }
}