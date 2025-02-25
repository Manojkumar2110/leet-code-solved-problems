class Solution {
    public int numOfSubarrays(int[] arr) {
        int result=0,odd=0,even=1,sum=0;;
        final int mod=1000000007;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum%2==1){
                result=(result+even)%mod;
                odd++;
            }
            else{
                result=(result+odd)%mod;
                even++;
            }
        }
        return result;
    }
}