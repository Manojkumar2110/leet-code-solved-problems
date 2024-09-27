class Solution {
    public int maximumCount(int[] nums) {
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else if(nums[i]<0){
                neg.add(nums[i]);
            }
        }
        if(pos.size()>neg.size()){
            return pos.size();
        }
        else{
            return neg.size();
        }
    }
}