class Solution {
    public String reverseVowels(String s) {
       char[] vov={'A','E','I','O','U','a','e','i','o','u'};
       StringBuilder sb=new StringBuilder(s);
       ArrayList<Character>ar=new ArrayList<>();
       for(char c:vov){
        ar.add(c);
       } 
       ArrayList<Character>ar1=new ArrayList<>();
       for(char c:s.toCharArray()){
        if(ar.contains(c)){
            ar1.add(c);
        }
       }
       int ind=ar1.size()-1;
       for(int i=0;i<sb.length();i++){
        if(ar.contains(sb.charAt(i))){
            sb.setCharAt(i,ar1.get(ind--));
        }
       }
       return sb.toString();
    }
}