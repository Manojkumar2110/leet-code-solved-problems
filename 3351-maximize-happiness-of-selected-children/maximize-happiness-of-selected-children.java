class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        for(int i=0,n=happiness.length;i<k;i++){
           int x=happiness[n-i-1]-i;
           sum+=Math.max(x,0);
        }
        return sum;
    }
}