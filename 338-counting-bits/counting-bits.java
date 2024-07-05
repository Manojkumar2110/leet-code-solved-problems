class Solution {
    public int[] countBits(int n) {
        int[] ar=new int[n+1];
        for(int i=0;i<=n;i++){
            ar[i]=Integer.bitCount(i);
        }
        return ar;
    }
}