class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String st=strs[0];
        String end=strs[strs.length-1];
        String res="";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==end.charAt(i)){
                res=res+st.charAt(i);
            }
            else{
                break;
            }
        }
        return res;
    }
}