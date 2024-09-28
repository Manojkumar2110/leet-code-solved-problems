class Solution {
    public int[] shortestToChar(String s, char c) {
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c){
                   if(min>Math.abs(i-j)){
                        min=Math.abs(i-j);
                   }
                }
            }
           arr[i]=min;
        }
        return arr;
    }
}