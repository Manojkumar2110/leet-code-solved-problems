class Solution {
    public List<Integer> intersection(int[][] nums) {
        LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(!hm.containsKey(nums[i][j])){
                    hm.put(nums[i][j],1);
                }
                else{
                    hm.put(nums[i][j],hm.get(nums[i][j])+1);
                }
            }
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int a:hm.keySet()){
            if(hm.get(a)==nums.length){
                al.add(a);
            }
        }
        Collections.sort(al);
        return al;
    }
}