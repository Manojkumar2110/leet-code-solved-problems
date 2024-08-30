class Solution {
    public boolean checkIfPangram(String sentence) {
       int arr[]=new int[26];
       for(int i=0;i<sentence.length();i++){
           arr[sentence.charAt(i)-'a']++; 
       } 
       int count=0;
       for(int j:arr){
        if(j>0){
            count++;
        }
       }
       if(count==26){
        return true;
       }
       return false;
    }
}