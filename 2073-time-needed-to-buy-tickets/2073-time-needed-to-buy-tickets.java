class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int value = tickets[k];
        int tracker = k;
        int counter = 0;
        
        ArrayList<Integer> copy = new ArrayList<>();
        
        for(int i: tickets){
            copy.add(i);
        }
        
        if(tickets.length > 1){
        
        while(value > 0){
            int val = copy.get(0);
            if(val > 0){
                val -= 1;
                copy.set(0, val);
                
                
            counter += 1;
            }
            
            if(tracker == 0){
                    value -= 1;
                }
                
            int store = tickets[0];
            
            copy.remove(0);
            copy.add(val);
                
            tracker -=1;
            if(tracker < 0){
                tracker = tickets.length-1;
            }
            
        }
            return counter;
        }
        
        else{
            return(tickets[0]);
        }
    }
}