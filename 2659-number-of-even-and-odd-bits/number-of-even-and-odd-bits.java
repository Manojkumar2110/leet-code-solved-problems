class Solution {
    public int[] evenOddBit(int n) {
       int even=0;
       int odd=0;
       StringBuilder sb=new StringBuilder(Integer.toBinaryString(n));
       sb.reverse();
       for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'&&i%2==0){
                even++;
            }
            else if(sb.charAt(i)=='1'&&i%2!=0){
                odd++;
            }
       }
       return new int[]{even,odd};
    }
}