class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>le=new ArrayList<>();
        ArrayList<Integer>mi=new ArrayList<>();
        ArrayList<Integer>ri=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                le.add(nums[i]);
            }
            else if(nums[i]==pivot){
                mi.add(nums[i]);
            }
            else{
                ri.add(nums[i]);
            }
        }
        ArrayList<Integer>fin=new ArrayList<>();
        for(int k:le){
            fin.add(k);
        }
        for(int u:mi){
            fin.add(u);
        }
        for(int t:ri){
            fin.add(t);
        }
        int ans[]=new int[fin.size()];
        for(int i=0;i<fin.size();i++){
            ans[i]=fin.get(i);
        }
        return ans;
    }
}