class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            int squ=i*i;
            if(split(squ,i)){
                sum+=squ;
            }
        }
        return sum;
    }
    static boolean split(int n,int k){
        if(n<k||k<0){
            return false;
        }
        if(n==k){
            return true;
        }
        return split(n/10,(k-n%10))||split(n/100,(k-n%100))||split(n/1000,(k-n%1000));
    }
}