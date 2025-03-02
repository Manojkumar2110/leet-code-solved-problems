class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer>hm=new TreeMap<>();
        for(int i=0;i<nums1.length;i++){
            if(!hm.containsKey(nums1[i][0])){
                hm.put(nums1[i][0],nums1[i][1]);
            }
            else{
                hm.put(nums1[i][0],hm.get(nums1[i][0])+nums1[i][1]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!hm.containsKey(nums2[i][0])){
                hm.put(nums2[i][0],nums2[i][1]);
            }
            else{
                hm.put(nums2[i][0],hm.get(nums2[i][0])+nums2[i][1]);
            }
        }
        int ans[][]=new int[hm.size()][2];
        int i=0;
        for(int a:hm.keySet()){
            ans[i][0]=a;
            ans[i][1]=hm.get(a);
            i++;
        }
        return ans;

    }
}