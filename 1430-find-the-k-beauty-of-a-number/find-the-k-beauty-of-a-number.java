class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String st=Integer.toString(num);
       for(int i=0;i<=st.length()-k;i++){
        String s=st.substring(i,i+k);
         int m=Integer.parseInt(s);
         if(m!=0&&num%m==0){
            count++;
         }
       } 
       return count;
    }
}