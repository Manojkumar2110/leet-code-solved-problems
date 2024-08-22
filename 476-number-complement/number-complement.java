class Solution {
    public int findComplement(int num) {
        String st=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='0'){
                sb.append('1');
            }
            if(st.charAt(i)=='1'){
                 sb.append('0');
            }
        }
        return Integer.parseInt(sb.toString(),2);
    }
}