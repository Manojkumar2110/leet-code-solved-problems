class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            if(i<k){
            sb.append(str[i]);
            sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}