class Solution {
    public int[] decode(int[] encoded) {
        int str=0;
        for(int i=1;i<=encoded.length+1;i++){
            str^=i;
        }
        for(int i=1;i<encoded.length;i+=2){
            str^=encoded[i];
        }
        int arr[]=new int[encoded.length+1];
        arr[0]=str;
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        return arr;
    }
}