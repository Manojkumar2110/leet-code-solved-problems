class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        if(startTime.length==1&&endTime.length==1&&startTime[0]==queryTime&&endTime[0]==queryTime){
            return 1;
        }
        int count=0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime&&queryTime<=endTime[i]){
                count++;
            }
        }
        return count;
    }
}