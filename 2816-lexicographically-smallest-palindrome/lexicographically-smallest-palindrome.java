class Solution {
    public String makeSmallestPalindrome(String s) {
      StringBuilder st=new StringBuilder(s);
      for(int i=0;i<s.length();i++){
        int j=s.length()-1-i;
            if(st.charAt(i)!=st.charAt(j)){
                if(st.charAt(i)<st.charAt(j)){
                    st.setCharAt(j,st.charAt(i));
                }
                else{
                     st.setCharAt(i,st.charAt(j));
                }
            }
        } 
      return st.toString(); 
    }
}