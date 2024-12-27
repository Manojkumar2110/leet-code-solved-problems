class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double>hs=new HashSet<>();
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            Double mid=(nums[l]+nums[r])/2.0;
            hs.add(mid);
            l++;
            r--;
        }
        return hs.size();
    }
}