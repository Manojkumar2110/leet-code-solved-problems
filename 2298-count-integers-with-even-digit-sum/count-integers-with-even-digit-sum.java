class Solution {
    public int countEven(int num) {
        int ans=0;
        int res=0;
        for(int i=1;i<=num;i++){
            if(i<9&&i%2==0){
                ans++;
            }
            if(i>9){
                int temp=i;
                while(temp>0){
                    res+=temp%10;
                    temp/=10;
                }
                if(res%2==0){
                    ans++;
                }
                res=0;
            }
        }
        return ans;
    }
}