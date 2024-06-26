class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int c1=0;
        int c2=0;
        for(int a:arr1){
            c1^=a;
        }
        for(int b:arr2){
            c2^=b;
        }
        return c1&c2;
    }
}