class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
    int sum=0;
    for(int n:nums2){sum+=n;}
    for(int n:nums1){sum-=n;}
    return sum/nums1.length;
    }
}