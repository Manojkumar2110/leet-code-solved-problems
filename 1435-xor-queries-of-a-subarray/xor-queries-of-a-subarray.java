class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(queries[i][0]==queries[i][1]){
                ans[i]=arr[queries[i][0]];
            }
            else{
            int xor=convert(queries[i][0],queries[i][1],arr);
            ans[i]=xor;
            }
        }
        return ans;
    }
    static int convert(int a,int b,int[] arr){
        int ans=0;
        for(int i=a;i<=b;i++){
            ans^=arr[i];
        }
        return ans;
    }
}