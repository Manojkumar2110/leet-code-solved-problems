class Solution {
    public int[] searchRange(int[] nums, int target) {
        Arrays.sort(nums);
        int arr[]=new int[2];
        arr[0]=arr[1]=-1;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                al.add(i);
            }
        }
        if(al.size()>0){
            arr[0]=al.get(0);
            arr[1]=al.get(al.size()-1);
        }
        return arr;
    }
}