class Solution {
    public int minOperations(int[] nums) {
        int count=0,t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=t){
                continue;
            }
            count++;
            t^=1;
        }
        return count;
    }
}