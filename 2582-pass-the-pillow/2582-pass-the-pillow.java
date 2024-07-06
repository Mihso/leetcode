class Solution {
    public int passThePillow(int n, int time) {
        int counter = 1;
        boolean odd = true;
        for(int i = 0; i < time; i++){
            if(odd){
                counter++;
            }
            else{
                counter--;
            }
            
            if(counter == n || counter == 1){
                odd = !odd;
            }
            
        }
        
        return counter;
        
    }
}