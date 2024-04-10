class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        
        int[] answer = new int[deck.length]; 
        boolean skip = false;
        int indexD = 0;
        int indexA = 0;
        
        while(indexD < deck.length){
            if(answer[indexA]==0){
                if(!skip){
                    answer[indexA] = deck[indexD];
                    indexD ++;
                }
                
                skip = !skip;
            }
            indexA = (indexA + 1) % deck.length;
        }
        
        return answer;
    }
}