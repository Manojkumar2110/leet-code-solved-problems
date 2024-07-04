class Solution {
    public String makeSmallestPalindrome(String s) {
    char arr[]=s.toCharArray();
    for(int i=0;i<s.length()/2;i++){
        int j=s.length()-1-i;
        if(arr[i]!=arr[j]){
            if(arr[i]<arr[j]){
                arr[j]=arr[i];
            }
            else{
                arr[i]=arr[j];
            }
        }
    }
      return new String(arr); 
    }
}