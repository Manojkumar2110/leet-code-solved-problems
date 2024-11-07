class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>com=new ArrayList<>();
        combi(ans,com,k,n,1);
        return ans;
    }
    static void combi(List<List<Integer>>ans,List<Integer>com,int k,int n,int st){
        if(n==0&&com.size()==k){
            ans.add(new ArrayList<>(com));
            return;
        }
        if(n<0||com.size()>k){
            return;
        }
        for(int i=st;i<=9;i++){
            com.add(i);
            combi(ans,com,k,n-i,i+1);
            com.remove(com.size()-1);
        }
    }
}