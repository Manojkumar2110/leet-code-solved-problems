class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        int max=-1;
        for(int a:hm.keySet()){
            if(hm.get(a)==a){
                max=Math.max(max,a);
            }
        }
        return max;
    }
}