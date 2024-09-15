class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        int ans[]=new int[2];
        int i=0;
        for(int a:hm.keySet()){
            if(hm.get(a)>=2){
                ans[i++]=a;
            }
        }
        return ans;
    }
}