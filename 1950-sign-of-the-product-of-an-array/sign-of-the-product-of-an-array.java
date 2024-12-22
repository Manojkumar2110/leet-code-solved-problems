class Solution {
    public int arraySign(int[] nums) {
       ArrayList<Integer>al=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            return 0;
        }
        else if(nums[i]>0){
            al.add(1);
        }
        else{
            al.add(-1);
        }
       }
       int prod=1;
       for(int i=0;i<al.size();i++){
        prod*=al.get(i);
       }
       return prod;
    }
}