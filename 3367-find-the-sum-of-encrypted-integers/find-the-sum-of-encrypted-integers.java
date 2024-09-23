class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer>al=new ArrayList<>();
            count=0;
            while(nums[i]>0){
                int res=nums[i]%10;
                al.add(res);
                count++;
                nums[i]/=10;
            }
            Collections.sort(al);
            int weight = (int) Math.pow(10, count)/9; 
            sum += al.get(al.size()-1) * weight;
        }
        return sum;
    }
}