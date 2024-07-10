class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str=new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1,count=0;
        while(i>=0||j>=0||count>0){
            int dig1=(i>=0)?num1.charAt(i--)-'0':0;
            int dig2=(j>=0)?num2.charAt(j--)-'0':0;
            int sum=dig1+dig2+count;
            str.append(sum%10);
            count=sum/10;
        }
        return str.reverse().toString();
    }
}