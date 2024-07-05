class Solution {
    public int minimumPushes(String word) {
        int sum=0;
        int ind=1;
        int count=1;
        int arr[]=new int[26];
        for(char c:word.toCharArray()){
            arr[c-'a']++;
        }
        Arrays.sort(arr);
        for(int i=25;i>=0;i--){
            if(ind<=8){
                ind++;
            }
            else{
                ind=2;
                count++;
            }
            sum+=(arr[i]*count);
        }
        return sum;
    }
}