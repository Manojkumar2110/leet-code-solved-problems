class Solution {
    public int minimumPushes(String word) {
        int sum=0;
        int c=0;
        for(int i=0;i<word.length();i++){
            if(i%8==0){
                c++;
            }
            sum+=c;
        }
        return sum;
    }
}