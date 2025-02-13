class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long>qu=new PriorityQueue<>();
        for(int a:nums){
            qu.add((long)a);
        }
        int count=0;
        while(qu.size()>1){
            if(qu.peek()>=k){
                return count;
            }
            long a=qu.poll();
            long b=qu.poll();
            long s=2*Math.min(a,b)+Math.max(a,b);
            qu.add(s);
            count++;
        }
        return count;
    }

}