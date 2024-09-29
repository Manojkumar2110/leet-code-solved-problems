class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=firev(num);
        int srev=secrev(rev);
        return srev==num?true:false;
    }
    static int firev(int num){
        int sum=0;
        while(num>0){
            int res=num%10;
            sum=sum*10+res;
            num/=10;
        }
        return sum;
    }
    static int secrev(int num){
        int sum=0;
        while(num>0){
            int res=num%10;
            sum=sum*10+res;
            num/=10;
        }
        return sum;
    }
}