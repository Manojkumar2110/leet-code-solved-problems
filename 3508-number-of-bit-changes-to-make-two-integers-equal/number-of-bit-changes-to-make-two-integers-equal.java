class Solution {
    public int minChanges(int n, int k) {
        k^=n;
        int count=Integer.bitCount(k);
        k&=n;
        return count==Integer.bitCount(k)?count:-1;
    }
}