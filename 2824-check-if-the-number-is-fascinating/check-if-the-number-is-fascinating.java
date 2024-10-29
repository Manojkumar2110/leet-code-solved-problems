class Solution {
    public boolean isFascinating(int n) {
       ArrayList<Integer>al=new ArrayList<>();
        int a=n*2;
        int b=n*3;
        while(n>0){
            int res=n%10;
            al.add(res);
            n/=10;
        }
        while(a>0){
            int res=a%10;
            al.add(res);
            a/=10;
        }
        while(b>0){
            int res=b%10;
            al.add(res);
            b/=10;
        }
        Collections.sort(al);
        if(al.size()>9){
            return false;
        }
        for(int i=1;i<=9;i++){
            if(!al.contains(i)){
                return false;
            }
        }
        return true;
    }
}