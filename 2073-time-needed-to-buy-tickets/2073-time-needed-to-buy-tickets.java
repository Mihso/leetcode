class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
//         int tracker = k;
//         int counter = 0;
        
//         ArrayList<Integer> copy = new ArrayList<>();
        
//         for(int i: tickets){
//             copy.add(i);
//         }
        
//         if(tickets.length > 1){
        
//         while(copy.get(tracker) > 0){
//             int val = copy.get(0);
//             if(val > 0){
//                 val -= 1;
//                 copy.set(0, val);
                
                
//             counter += 1;
//             }
            
//             copy.remove(0);
//             copy.add(val);
                
//             tracker -=1;
//             if(tracker < 0){
//                 tracker = tickets.length-1;
//             }
            
//         }
//             return counter;
//         }
        
//         else{
//             return(tickets[0]);
//         }
        
        
        int total = 0;
        
        for(int i =0; i< tickets.length; i++){
            if(i <= k){
                total += Math.min(tickets[i], tickets[k]);
            }
            else{
                total += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return total;
    }
}