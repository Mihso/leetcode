class Solution {
    public int numSteps(String s) {
        List<Integer> values = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            values.add( Character.getNumericValue( s.charAt(i)));
        }
        
        int counter = 0;

        while(values.size() > 1){
            int last = values.get(values.size() - 1);
            
            if(last == 1){
                int carry = 1;
                for(int i = values.size() - 1; i >= 0; i--){
                    int newwer = values.get(i) + carry;
                    values.set(i, newwer % 2);
                    carry = newwer / 2;
                }
                if(carry == 1){
                    values.add(0, 0);
                }
            }
            else{
                values.remove(values.size() - 1);
            }
            counter++;
        }
        
        return counter;
    }
}