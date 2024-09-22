class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer>odd=new ArrayList<>();
        ArrayList<Integer>even=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<odd.size();i++){
                ans.add(even.get(i));
                ans.add(odd.get(i));
        }
       int arr[]=new int[nums.length];
       for(int i=0;i<ans.size();i++){
        arr[i]=ans.get(i);
       }
       return arr;
    }
}