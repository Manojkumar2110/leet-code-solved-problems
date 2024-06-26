class Solution {
    public int xorBeauty(int[] nums) {
        int c1=0;
        for(int n:nums){
            c1=c1^n;
        }
        return c1;
    }
}