class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[]=sentence.split(" ");
        int k=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].startsWith(searchWord)){
               return i+1;
            }
        }
        return -1;
    }
}