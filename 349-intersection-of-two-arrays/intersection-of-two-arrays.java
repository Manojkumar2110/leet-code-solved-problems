class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hs=new HashSet<>();
        for(int set1:nums1){
            hs.add(set1);
        }
        HashSet<Integer>hs1=new HashSet<>();
        for(int set2:nums2){
            if(hs.contains(set2)){
                hs1.add(set2);
            }
        }
        int[] ar=new int[hs1.size()];
        int index=0;
        for(int ans:hs1){
            ar[index++]=ans;
        }
        return ar;
    }
}