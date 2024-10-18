class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        int fi=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>=10){
                    String st=Integer.toString(nums[i]);
                    fi=(int)st.charAt(0)-'0';
                }
                else{
                    fi=nums[i];
                }
                int k=coprime(fi,nums[j]%10);
                if(k==1){
                    count++;
                }
            }
        }
        return count;
    }
    static int coprime(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}