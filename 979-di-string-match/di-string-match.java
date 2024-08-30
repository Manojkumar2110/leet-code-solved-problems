class Solution {
    public int[] diStringMatch(String s) {
        int low=0;
        int high=s.length();
        int arr[]=new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=low++;
            }
            else{
                arr[i]=high--;
            }
        }
        arr[s.length()]=high;
        return arr;
    }
}