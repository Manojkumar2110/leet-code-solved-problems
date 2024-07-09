class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
    int a=Arrays.stream(nums1).min().getAsInt();
    int b=Arrays.stream(nums2).min().getAsInt(); 
    return b-a;
    }
}