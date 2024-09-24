class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        int max=0;
        int ma=0;
        for(int n:hm.keySet()){
            if(hm.get(n)>max){
                ma=n;
                max=hm.get(n);
            }
        }
        return ma;
    }
}