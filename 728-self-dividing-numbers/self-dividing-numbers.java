class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>li=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(result(i)){
                li.add(i);
            }
        }
        return li;
    }
    public static boolean result(int num){
        int dig=0;
        int temp=num;
          while(num!=0){
            dig=num%10;
            if(dig==0 || temp%dig!=0)
                return false;
            num/=10;
            }
            return true;
            
        }
}