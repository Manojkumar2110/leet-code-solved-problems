class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>com=new ArrayList<>();
        combi(1,ans,com,n,k);
        return ans;
    }
    static void combi(int st,List<List<Integer>>ans,List<Integer>com,int n,int k){
        if(com.size()==k){
            ans.add(new ArrayList<>(com));
            return;
        }
        for(int i=st;i<=n;i++){
            com.add(i);
            combi(i+1,ans,com,n,k);
            com.remove(com.size()-1);
        }
    }
}