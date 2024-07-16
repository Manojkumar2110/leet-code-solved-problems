class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb=new StringBuilder();
        for(String c:word1){
            sb.append(c);
        }
        StringBuilder sb1=new StringBuilder();
        for(String c:word2){
            sb1.append(c);
        }
        return sb.toString().equals(sb1.toString());
    }
}