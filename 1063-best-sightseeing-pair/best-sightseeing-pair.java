class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=Integer.MIN_VALUE;
        int i=0;
        for(int j=1;j<values.length;j++){
            values[i]--;
            max=Math.max(values[i]+values[j],max);
            if(values[i]<=values[j]){
                i=j;
            }
        }
        return max;
    }
}