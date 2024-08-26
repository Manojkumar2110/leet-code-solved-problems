class Solution {
    public boolean checkString(String s) {
        char[] a=s.toCharArray();
        char[] b=s.toCharArray();
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return true;
        }
        return false;
    }
}