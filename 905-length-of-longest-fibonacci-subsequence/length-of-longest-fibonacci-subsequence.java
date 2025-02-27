class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer>hs=new HashSet<>();
        for(int a:arr){
            hs.add(a);
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int prev=arr[j];
                int curr=arr[i]+arr[j];
                int len=2;
                while(hs.contains(curr)){
                    int temp=curr;
                    curr+=prev;
                    prev=temp;
                    max=Math.max(max,++len);
                }
            }
        }
        return max;

    }
}