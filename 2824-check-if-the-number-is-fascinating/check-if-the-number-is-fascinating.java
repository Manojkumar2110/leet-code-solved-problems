class Solution {
    public boolean isFascinating(int n) {
       String concat=""+n+(n*2)+(n*3);
       int[] count=new int[10];
       for(char c:concat.toCharArray()){
            count[c-'0']++;
       } 
       if(count[0]>0||concat.length()!=9){
        return false;
       }
       for(int i=1;i<9;i++){
        if(count[i]!=1){
            return false;
        }
       }
       return true;
    }
}