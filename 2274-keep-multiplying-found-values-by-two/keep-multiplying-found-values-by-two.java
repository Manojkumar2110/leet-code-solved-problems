class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int n:nums){
            al.add(n);
        }
        if(!al.contains(original)){
            return original;
        }
        for(int i=0;i<nums.length;i++){
            original*=2;
            if(!al.contains(original)){
                return original;
            }
        }
        return original;
    }
}