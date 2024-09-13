class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>al=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        perm(nums,al,ans);
        return al;
    }
    static void perm(int[] nums,List<List<Integer>>al,List<Integer>ans){
        if(ans.size()==nums.length){
            al.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])){
                continue;
            }
            ans.add(nums[i]);
            perm(nums,al,ans);
            ans.remove(ans.size()-1);
        }
        return;
    }
}