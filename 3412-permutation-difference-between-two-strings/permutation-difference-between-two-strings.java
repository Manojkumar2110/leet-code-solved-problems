class Solution {
    public int findPermutationDifference(String s, String t) {
        int count=0;
        for(int i=0;i<t.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                count+=Math.abs(i-j);
                }
            }
        }
        return count;
    }
}