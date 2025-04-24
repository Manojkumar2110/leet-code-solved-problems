class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer>ans=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                ans.add(nums[j]);
                if(ans.size()==hs.size()){
                    count++;
                }
            }
        }
        return count;
    }
}