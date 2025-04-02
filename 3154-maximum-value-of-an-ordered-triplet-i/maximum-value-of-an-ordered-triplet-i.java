class Solution {
    public long maximumTripletValue(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        long max=Long.MIN_VALUE;
      
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                   
                   long pro=(long)(nums[i]-nums[j])*nums[k];
                   
                    max=Math.max(pro,max);
                }
            }
        }
        return max<0 ? 0:max;
    }
}