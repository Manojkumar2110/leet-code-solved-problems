class Solution {
    public String removeDigit(String number, char digit) {
        int k=0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                k=i;
                if(i<number.length()-1&&digit<number.charAt(i+1)){
                    break;
                }
            }
        }
        number=number.substring(0,k)+number.substring(k+1);
        return number;
    }
}