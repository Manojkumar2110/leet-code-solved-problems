class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='|'){
                count++;
            }
            if(count%2==0){
                    if(ch=='*'){
                        max++;
                    }
                }
        }
        return max;
    }
}