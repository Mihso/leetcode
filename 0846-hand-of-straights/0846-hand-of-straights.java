class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // Map<Integer, Integer> mapper = new HashMap<>();
        
        if(hand.length % groupSize != 0){
            return false;
        }
        if(hand.length == 1){
            return true;
        }
        
        // for(int i: hand){
        //     if(!mapper.containsKey(i)){
        //         mapper.put(i,0);
        //     }
        //     mapper.put(i, mapper.get(i) + 1);
        // }
        // if(hand.length == groupSize){
        //     for(int i: mapper.values()){
        //         if(i > 1){
        //             return false;
        //         }
        //     }
        //     return true;
        // }
        
        Arrays.sort(hand);
        for(int i = 0; i < hand.length / groupSize; i++){
            int counter = 0;
            int previous = -1;
            for(int x = 0; x < hand.length; x++){
                if(hand[x] > previous && counter < groupSize){
                    counter+= 1;
                    if(previous != -1 && hand[x] != previous + 1){
                        return false;
                    }
                    previous = hand[x];
                    hand[x] = -1;
                }
            }
        }
        
        for(int i: hand){
            if(i != -1){
                return false;
            }
        }
        
        return true;
        
    }
}