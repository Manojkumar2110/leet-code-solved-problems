class Solution {
    public boolean isHappy(int n) {
        int res=0,c=0;
        while(n!=1&&n!=4){
            c=0;
            while(n>0){
                res=n%10;
                n/=10;
                c+=res*res;
            }
            n=c;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}