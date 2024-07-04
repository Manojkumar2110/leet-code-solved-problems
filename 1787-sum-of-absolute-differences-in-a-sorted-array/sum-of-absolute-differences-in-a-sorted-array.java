class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
    int lsum=0;
    int rsum=0;
    int arr[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            rsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rsum-=nums[i];
            if(i==0){
                arr[i]=rsum-(nums.length-1)*nums[i];
            }
            else{
                lsum+=nums[i-1];
                int flsum=nums[i]*i-lsum;
                int frsum=rsum-(nums.length-1-i)*nums[i];
                arr[i]=flsum+frsum;
            }
        }
        return arr;
    }
}