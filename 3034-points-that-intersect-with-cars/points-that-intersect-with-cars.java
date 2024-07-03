class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer>hs=new HashSet<>();
        List<Integer>al=new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            al=nums.get(i);
            int st=al.get(0);
            int end=al.get(1);
            for(int j=st;j<=end;j++){
                hs.add(j);
            }
        }
        return hs.size();
    }
}