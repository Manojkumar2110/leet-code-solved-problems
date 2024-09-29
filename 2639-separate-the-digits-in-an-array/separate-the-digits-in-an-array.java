class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           String s=Integer.toString(nums[i]);
           for(int j=0;j<s.length();j++){
            int a=Character.getNumericValue(s.charAt(j));
            al.add(a);
           }
        }
        int arr[]=new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
}