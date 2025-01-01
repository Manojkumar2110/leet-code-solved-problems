class Solution {
    public int maxScore(String s) {
        int max=Integer.MIN_VALUE;
        int z=0,o=0,to=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                to++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                z++;
            }
            else{
                o++;
            }
            int curr=z+(to-o);
            max=Math.max(curr,max);
        }
        return max;
    }
}