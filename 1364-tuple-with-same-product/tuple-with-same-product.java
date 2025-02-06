class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int pro=nums[i]*nums[j];
                if(!hm.containsKey(pro)){
                    hm.put(pro,1);
                }
                else{
                    hm.put(pro,hm.get(pro)+1);
                }
            }
        }
        int ans=0;
        for(int a:hm.values()){
            if(a>1){
                ans+=a*(a-1)*4;
            }
        }
        return ans;
    }
}