class Solution {
    public int minBitFlips(int start, int goal) {
        String starter = Integer.toBinaryString(start);
        String goaler = Integer.toBinaryString(goal);
        
        while(goaler.length() > starter.length()){
            starter = "0" + starter;
        }
        while(goaler.length() < starter.length()){
            goaler = "0" + goaler;
        }
        
        int counter = 0;
        for(int i = 0; i < starter.length(); i++){
            if(starter.charAt(i) != goaler.charAt(i)){
                counter++;
            }
        }
        
        return counter;
        
    }
}