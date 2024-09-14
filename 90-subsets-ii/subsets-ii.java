class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>al=new ArrayList<>();
        List<Integer>an=new ArrayList<>();
        Arrays.sort(nums);
        subset(al,an,nums,0);
        return al;
    }
    static void subset(List<List<Integer>>ans,List<Integer>pro,int[] nums,int index){
        if(index==nums.length&&!ans.contains(pro)){
            ans.add(new ArrayList<>(pro));
            return;
        }
        pro.add(nums[index]);
        subset(ans,pro,nums,index+1);
        pro.remove(pro.size()-1);
         while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        subset(ans,pro,nums,index+1);
    }
}