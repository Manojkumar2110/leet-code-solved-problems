class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<blocks.length()-k+1;i++){
            int count=0;
            String str=blocks.substring(i,i+k);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='W'){
                    count++;
                }
            }
            min=Math.min(count,min);
        }
        return min;
    }
}