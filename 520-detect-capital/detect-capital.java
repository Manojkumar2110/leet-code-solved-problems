class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0;
        int sml=0;
        for(int i=0;i<word.length();i++){
            if((int)word.charAt(i)>=64&&(int)word.charAt(i)<=90){
                cap++;
            }
            if((int)word.charAt(i)>=97&&(int)word.charAt(i)<=122){
                sml++;
            }
            
        }
        if((int)word.charAt(0)>=64&&(int)word.charAt(0)<=90&&cap==1&&sml==word.length()-1){
            return true;
        }
        else if(cap==word.length()||sml==word.length()){
            return true;
        }
        else{
            return false;
        }
    }
}