class Solution {
    public boolean findSubarrays(int[] nums) {
        if(nums.length<=2){
            return false;
        }
        HashSet<Integer>hs=new HashSet<>();
        for(int i=1;i<nums.length;i++){
            if(!hs.add(Math.abs(nums[i-1]+nums[i]))){
                return true;
            }
        }
        
        return false;
    }
}