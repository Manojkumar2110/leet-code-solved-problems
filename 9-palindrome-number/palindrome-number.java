class Solution {
    public boolean isPalindrome(int x) {
       String strnum = String.valueOf(x);
       int st=0;
       int end=strnum.length()-1;
       while(st<end){
        if(strnum.charAt(st)!=strnum.charAt(end)){
            return false;
        }
        st++;
        end--;
       }
       return true;
    }
}