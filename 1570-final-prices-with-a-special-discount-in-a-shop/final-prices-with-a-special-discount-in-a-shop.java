class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] <= prices[i] && j!=i){
                    prices[i]-=prices[j];
                     break;
                }
            }
        }
        return prices;
    }
}