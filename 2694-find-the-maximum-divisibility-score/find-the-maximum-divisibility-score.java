class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
       ArrayList<Integer>al=new ArrayList<>();
       int max=0;
       for(int i=0;i<divisors.length;i++){
        int count=0;
         for(int j=0;j<nums.length;j++){
            if(nums[j]%divisors[i]==0){
                count++;
            }
         }
         max=Math.max(count,max);
       }
       for(int i=0;i<divisors.length;i++){
        int count=0;
         for(int j=0;j<nums.length;j++){
            if(nums[j]%divisors[i]==0){
                count++;
            }
         }
         if(count==max){
            al.add(divisors[i]);
         }
       }
       Collections.sort(al);
       return al.get(0);
    }
}