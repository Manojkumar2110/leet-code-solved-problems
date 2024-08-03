class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        String str="";
        String str1="";
        for(int i=0;i<target.length;i++){
            str=str+target[i];
            str1=str1+arr[i];
        }
        if(str.equals(str1)){
            return true;
        }
        else{
            return false;
        }
    }
}