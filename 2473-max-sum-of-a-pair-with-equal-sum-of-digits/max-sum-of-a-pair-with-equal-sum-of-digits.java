class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int max=-1;
        for(int i=0;i<nums.length;i++){
            int sum=digSum(nums[i]);
            if(!hm.containsKey(sum)){
                hm.put(sum,nums[i]);
            }
            else{
                max=Math.max(max,hm.get(sum)+nums[i]);
                hm.put(sum,Math.max(hm.get(sum),nums[i]));
            }

        }
        return max;
    }
    static int digSum(int n){
        int sum=0;
        while(n>0){
            int res=n%10;
            sum+=res;
            n/=10;
        }
        return sum;
    }
}