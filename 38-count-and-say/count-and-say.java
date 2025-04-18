class Solution {
    public String countAndSay(int n) {
        String str="1";
        while(n-1>0){
            str=helper(str);
            n--;
        }
        return str;
    }
    static String helper(String str){
        StringBuilder sb=new StringBuilder();
        int count=1;
        char preChar=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==preChar){
                count++;
            }
            else{
                sb.append(count).append(preChar);
                count=1;
                preChar=str.charAt(i);
            }
        }
        sb.append(count).append(preChar);
        System.out.println(sb.toString());
        return sb.toString();
    }
}