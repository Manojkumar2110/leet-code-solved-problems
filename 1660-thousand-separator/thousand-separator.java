class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb=new StringBuilder();
        sb.append(n);
        if(sb.length()<=3){
            return sb.toString();
        }
        StringBuilder sb2=new StringBuilder();
        int count=0;;
        for(int i=sb.length()-1;i>=0;i--){
            sb2.append(sb.charAt(i));
            count++;
            if(count==sb.length()){
                break;
            }
            if(count%3==0){
                sb2.append(".");
            }
        }
        return sb2.reverse().toString();
    }
}