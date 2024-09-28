class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
       int count=0;
       for(int i=0;i<commands.size();i++){
        if(commands.get(i).equals("RIGHT")){
            count++;
        }
        else if(commands.get(i).equals("LEFT")){
            count--;
        }
        else if(commands.get(i).equals("DOWN")){
            count+=n;
        }
        else if(commands.get(i).equals("UP")){
            count-=n;
        }
       }
       return count;
    }
}