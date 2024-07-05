class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res=0;
        int j=0;
       for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(j)){
                if(neededTime[i]>neededTime[j]){
                    res+=neededTime[j];
                    j=i;
                }
                else{
                    res+=neededTime[i]; 
                    
                }
            }
            else{
                j=i;
            }
       }
       return res;
    }
}