class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        String[] sp=date.split("-");
        for(int i=0;i<sp.length;i++){
            String bin=convert(sp[i]);
            sb.append(bin);
            sb.append("-");
        }
        String ans=sb.toString();
        return ans.substring(0,ans.length()-1);
    }
    static String convert(String str){
        int con=Integer.parseInt(str);
        String ans1=Integer.toBinaryString(con);
        return ans1;
    } 
   
}