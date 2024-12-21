class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0,eve=0;
        for(int pos:position){
            if(pos%2==0){
                eve++;
            }
            else{
                odd++;
            }
        }
        return Math.min(odd,eve);
    }
}