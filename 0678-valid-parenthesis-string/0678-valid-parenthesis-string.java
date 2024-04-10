class Solution {
    public boolean checkValidString(String s) {
        ArrayList<Integer> counter = new ArrayList<>();
        ArrayList<Integer> any = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char val = s.charAt(i);
            if(val == '('){
                counter.add(i);
            }
            else if(val == '*')
            {
                any.add(i);
            }
            else{
                if(counter.size() > 0){
                    counter.remove(counter.size() - 1);
                }
                else if(any.size() > 0){
                    any.remove(any.size() - 1 );
                }
                else{
                    return false;
                }
            }
            
               
        }
        
        while(counter.size() > 0 && any.size() > 0){
            if(counter.get(counter.size() - 1) > any.get(any.size() - 1)){
                return false;
            }
            else{
                counter.remove(counter.size() - 1);
                any.remove(any.size() - 1);
            }
        }
        
        return (counter.size() == 0);
    }
}