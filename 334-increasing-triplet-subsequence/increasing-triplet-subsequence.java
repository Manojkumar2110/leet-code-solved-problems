class Solution {
    public boolean increasingTriplet(int[] nums) {
       if(nums.length<3) return false; 
       int fst=Integer.MAX_VALUE;
       int sec=Integer.MAX_VALUE;
       for(int n:nums){
        if(n<=fst){
            fst=n;
        }
        else if(n<=sec){
            sec=n;
        }
        else{
            return true;
        }
       }
       return false;
    }

}