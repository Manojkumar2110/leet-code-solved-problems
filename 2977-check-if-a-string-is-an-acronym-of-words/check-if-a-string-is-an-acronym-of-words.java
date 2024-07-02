class Solution {
    public boolean isAcronym(List<String> words,final String s) {
        int i=0,j=0;
        while(i<words.size()&&j<s.length()){
            if(words.get(i++).charAt(0)!=s.charAt(j++)){
                return false;
            }
        }
        return i==words.size()&&j==s.length();
    }
}