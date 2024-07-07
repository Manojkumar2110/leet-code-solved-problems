class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int flip=0;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(!q.isEmpty()&&q.peek()<=i-k){
                q.poll();
            }
            if(q.size()%2==nums[i]){
                if(i+k>nums.length){
                    return -1;
                }
                flip++;
                q.add(i);
            }
        }
        return flip;
    }
}