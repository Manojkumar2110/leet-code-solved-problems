class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        int sum=0;
        for(int n:hm.keySet()){
            if(hm.get(n)==1){
                sum+=n;
            }
        }
        return sum;
    }
}