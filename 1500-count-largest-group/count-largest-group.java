class Solution {
    public int countLargestGroup(int n) {
        int sums[]=new int[37];
        for(int i=1;i<=n;i++){
            sums[digits(i)]++;
        }
        int count=0,max=0;
        for(int s:sums){
           if(s>max){
            max=s;
            count=0;
           } 
           else if(s==max){
            count++;
           }
        }
        return count+1;
    }
    static int digits(int a){
        int count=0;
        while(a>0){
            count+=a%10;
            a/=10;
        }
        return count;
    }
}




   
