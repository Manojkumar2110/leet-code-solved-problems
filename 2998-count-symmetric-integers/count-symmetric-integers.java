class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(isSymmetric(i)){
                count++;
            }
        }
        return count;
    }
    static boolean isSymmetric(int n){
        int l=n;
        int len=Integer.toString(n).length();
        if(len%2!=0){
            return false;
        }
        int a=0,b=0;
        int pow=(int)Math.pow(10,(len/2));
        a=l%pow;
        b=l/pow;
        if(sum(a)==sum(b)){
            return true;
        }
        else{
            return false;
        }

    }
    static int sum(int s){
        int sum=0;
        while(s>0){
            int res=s%10;
            sum+=res;
            s/=10;
        }
        return sum;
    }
}