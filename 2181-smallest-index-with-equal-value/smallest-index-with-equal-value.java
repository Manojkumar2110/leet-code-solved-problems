class Solution {
    public int smallestEqual(int[] nums) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                al.add(i);
            }
        }
        if(al.size()==0){
            return -1; 
        }
        else{
            return al.get(0);
        }
    }
}