class Solution {
    public int xorBeauty(int[] nums) {
        int c1=0;
        for(int a:nums){
            c1=c1^a;
        }
        return c1;
    }
}