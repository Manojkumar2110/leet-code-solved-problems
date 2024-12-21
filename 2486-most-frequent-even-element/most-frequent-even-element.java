class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        ArrayList<Integer>al=new ArrayList<>();
        int max=-1;
        for(int ele:hm.keySet()){
            if(hm.get(ele)>=max&&ele%2==0){
                max=hm.get(ele);
            }
        }
        for(int ele:hm.keySet()){
            if(hm.get(ele)==max&&ele%2==0){
                al.add(ele);
            }
        }
        Collections.sort(al);
        if(al.size()==0){
            return max;
        }
        else{
            return al.get(0);
        }
    }
}