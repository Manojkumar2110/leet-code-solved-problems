class Solution {
    public String toGoatLatin(String sentence) {
        String []str=sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        int a=2;
        for(String s:str){
                if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'||s.charAt(0)=='A'||s.charAt(0)=='E'||s.charAt(0)=='I'||s.charAt(0)=='O'||s.charAt(0)=='U'){
                    sb.append(s);
                    sb.append("m");
                    for(int k=0;k<a;k++){
                        sb.append("a");
                    }
                    sb.append(" ");
                }
                else{
                    sb.append(s.substring(1,s.length()));
                    sb.append(s.charAt(0));
                    sb.append("m");
                    for(int l=0;l<a;l++){
                        sb.append("a");
                    }
                    sb.append(" ");
                }
                a++;
            }
        return sb.toString().trim(); 
    }
}