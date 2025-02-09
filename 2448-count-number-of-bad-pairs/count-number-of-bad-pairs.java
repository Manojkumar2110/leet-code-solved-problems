class Solution {
    public long countBadPairs(int[] nums) {
        long tot=(long)nums.length*(nums.length-1)/2;
        long count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i]-i)){
                hm.put(nums[i]-i,1);
            }
            else{
                hm.put(nums[i]-i,hm.get(nums[i]-i)+1);
            }
        }
        for(int a:hm.values()){
            count+=(long)a*(a-1)/2;
        }
        return tot-count;
    }
}