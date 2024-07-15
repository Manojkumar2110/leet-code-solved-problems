class Solution {
    public int maxDepth(String s) {
        int max=0;
        int openbracket=0;
        for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='('){
                openbracket++;
            }
            else if(s.charAt(i)==')'){
                openbracket--;
            }
            max=Math.max(max,openbracket);
        }
        return max;
    }
}