class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean>al=new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=(sum*2+nums[i])%5;
            if(sum==0){
                al.add(true);
            }
            else{
                al.add(false);
            }
        }
        return al;
    }
}