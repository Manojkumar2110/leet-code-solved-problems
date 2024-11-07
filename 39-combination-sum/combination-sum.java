class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>com=new ArrayList<>();
        combi(candidates,target,ans,com);
        List<List<Integer>>ans1=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            Collections.sort(ans.get(i));
            if(!ans1.contains(ans.get(i))){
                ans1.add(ans.get(i));
            }
        }
        return ans1;
    }
    static void combi(int arr[],int tar,List<List<Integer>>ans,List<Integer>com){
        if(tar==0){
            ans.add(new ArrayList<>(com));
            return;
        }
        if(tar<0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            com.add(arr[i]);
            combi(arr,tar-arr[i],ans,com);
            com.remove(com.size()-1);
        }
    }
}