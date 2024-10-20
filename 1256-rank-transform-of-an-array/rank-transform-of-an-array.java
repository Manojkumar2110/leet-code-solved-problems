class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
        Collections.sort(al);
        int a=1;
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(al.get(i))){
                hm.put(al.get(i),a++);
            }
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=hm.get(arr[i]);
        }
        return ans;
    }
}