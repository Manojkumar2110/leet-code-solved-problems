class Solution {
    public int largestCombination(int[] candidates) {
    int ar[]=new int[32];
    int rem=0;
    for(int i=0;i<candidates.length;i++){
        for(int j=0;j<32;j++){
            int temp=candidates[i]&(1<<j);
            if(temp!=0){
                ar[j]+=1;
                rem=Math.max(rem,ar[j]);
            }
        }
    }           
    
    return rem;
    }
}