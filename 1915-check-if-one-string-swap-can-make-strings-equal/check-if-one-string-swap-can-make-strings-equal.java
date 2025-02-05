class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int fi=-1;
        int sec=-1;
        int count=0;
        for(int i=0;i<s2.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count==1){
                    fi=i;
                }
                else if(count==2){
                    sec=i;
                }
                else{
                    return false;
                }
            }
        }  
       
        if(count==0){
            return true;
        }
        if(count==2&&s1.charAt(fi)==s2.charAt(sec)&&s1.charAt(sec)==s2.charAt(fi)){
            return true;
        }  
        return false;  
    }
}