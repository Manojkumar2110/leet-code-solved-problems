class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
        }
        for(int i=0;i<num;i++){
            int a=rev(i);
            if((a+i)==num){
                return true;
            }
        }
        return false;
    }
    static int rev(int n){
        int sum=0;
        while(n>0){
            int res=n%10;
            sum=sum*10+res;
            n/=10;
        }
        return sum;
    }
}