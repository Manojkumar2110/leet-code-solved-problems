class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            al.add(nums[i]-nums[i-1]);
        }
        Collections.sort(al);
        return al.get(al.size()-1);
    }
}