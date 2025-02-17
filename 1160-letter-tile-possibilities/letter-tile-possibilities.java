class Solution {
    public int numTilePossibilities(String tiles) {
        int arr[]=new int[26];
        for(char c:tiles.toCharArray()){
            arr[c-'A']++;
        }
        return charCount(arr);
    }
    static int charCount(int arr[]){
        int count=0;
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                arr[i]--;
                count+=1+charCount(arr);
                arr[i]++;
            }
        }
        return count;
    }
}