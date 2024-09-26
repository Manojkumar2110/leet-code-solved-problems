class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        return gcd(a,b);
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else if(a==b){
            return a;
        }
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else if(b>a){
                b=b-a;
            }
        }
        return a;
    }
}