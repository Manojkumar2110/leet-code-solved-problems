class Solution {
    public int smallestNumber(int n, int t) {
        int ans=0;
        for(int i=n;i<n+10;i++){
            int pro=1;
            int temp=i;
            while(temp>0){
                int res=temp%10;
                pro*=res;
                temp/=10;
            }
            if(pro%t==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
}