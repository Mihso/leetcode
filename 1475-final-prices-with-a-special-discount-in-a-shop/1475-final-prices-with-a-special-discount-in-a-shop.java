class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i = 0; i < prices.length - 1; i++){
            int index = i + 1;
            
            while(index < prices.length && prices[index] > prices[i]){
                index += 1;
            }
            if(index < prices.length){
                prices[i] -= prices[index];
            }
        }
        return prices;
    }
}