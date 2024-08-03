class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>al=new ArrayList<>();
        int a=nums[0];
        int b=nums[nums.length-1];
        al.add(a);
        al.add(b);
        for(int i=0;i<nums.length;i++){
            if(!al.contains(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}