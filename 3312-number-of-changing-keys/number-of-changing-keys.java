class Solution {
    public int countKeyChanges(String s) {
        String t=s.toLowerCase();
        int count=0;
        for(int i=1;i<t.length();i++){
            if(t.charAt(i-1)!=t.charAt(i)){
                count++;
            }
        }
        return count;
    }
}