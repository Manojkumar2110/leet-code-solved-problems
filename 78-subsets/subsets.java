class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>al=new ArrayList<>();
        ArrayList<Integer>an=new ArrayList<>();
        subset(al,an,nums,0);
        return al;
    }
    static void subset(List<List<Integer>>ans,List<Integer>pro,int[] nums,int index){
        if(index==nums.length){
            ans.add(new ArrayList<>(pro));
            return;
        }
       
        pro.add(nums[index]);
        subset(ans,pro,nums,index+1);
        pro.remove(pro.size()-1);
        subset(ans,pro,nums,index+1);
    }
}