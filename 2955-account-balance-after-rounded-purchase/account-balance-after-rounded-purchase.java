class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10==0){
            return 100-purchaseAmount;
        }
        int x=100-purchaseAmount;
        return purchaseAmount%10>=5? (x/10)*10:((x/10)+1)*10;
    }
}