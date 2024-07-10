class Solution {
    public int minOperations(String[] logs) {
        int counter = 0;
        for(String s : logs){
            if(s.equals("../")){
                counter -= 1;
            }
            else if(s.equals("./")){
                
            }
            else{
                counter+=1;
            }
            if(counter < 0){
                counter= 0;
            }
        }
        return counter;
    }
}