class Solution {
    public int minFlips(int a, int b, int c) {
        int counter = 0;
        int value = a|b;
        while(value != c){
            
            int lasta = a%2;
            int lastb = b%2;
            int lastc = c%2;
            int lastval = value%2;
            if(lastval != lastc && lastc == 1){
                counter +=1;
            }
            else if(lastval != lastc && lastc == 0){
                if(lastb != lasta){
                    counter += 1;
                }
                else{
                    counter +=2;
                }
            }
            value /=2;
            a /=2;
            b/=2;
            c /= 2;
        }
        
        return counter;
        
    }
}