class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ar=new ArrayList<>();
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(st.contains(nums[i])){
                ar.add(nums[i]);
            } 
            st.add(nums[i]);   
        }
        return ar;
    }
}