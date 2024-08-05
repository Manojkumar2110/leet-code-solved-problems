class Solution {
    public String getEncryptedString(String s, int k) {
       String str="";
       k=k%s.length();
       for(int i=k;i<s.length();i++){
        str+=s.charAt(i);
       }
       for(int i=0;i<k;i++){
        str+=s.charAt(i);
       }
       return str;
    }
}