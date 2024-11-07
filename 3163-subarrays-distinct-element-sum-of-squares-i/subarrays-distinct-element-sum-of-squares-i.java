class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            List<Integer>al=new ArrayList<>();
            for(int j=i;j<nums.size();j++){
                if(!al.contains(nums.get(j))){
                    al.add(nums.get(j));
                }
                ans+=al.size()*al.size();
            }
        }
        return ans;
    }
}