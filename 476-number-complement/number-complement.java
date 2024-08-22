class Solution {
    public int findComplement(int num) {
        int st=Integer.toBinaryString(num).length();
        int a=(1 << st)-1;
        return num^a;
    }
}