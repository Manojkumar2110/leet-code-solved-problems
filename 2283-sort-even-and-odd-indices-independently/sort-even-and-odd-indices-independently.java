class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer>odd=new ArrayList<>();
        ArrayList<Integer>eve=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                eve.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(eve);
        Collections.sort(odd,Collections.reverseOrder());
        int arr[]=new int[nums.length];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=eve.get(j++);
            }
            else{
                arr[i]=odd.get(k++);
            }
        }
        return arr;
    }
}