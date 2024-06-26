class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int c1=0;
        int c2=0;
        for(int a:nums1){
            c1^=a;
        }
        for(int b:nums2){
            c2^=b;
        }
        return (nums1.length%2*c2)^(nums2.length%2*c1);
    }
}