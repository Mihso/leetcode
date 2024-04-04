class Solution {
    
    List<String> finall = new ArrayList<String>();
    
    public List<String> generateParenthesis(int n) {
        generator("", 0, 0, n);
        return finall;
    }
    
    
    public void generator(String s ,int counter1, int counter2, int n){
        if(s.length() >= n*2 && counter1 == counter2){
             finall.add(s);
        }
        else if(counter1 < counter2 || counter1 > n || counter2 > n){
           ;
        }
        else{
        String one = s + "(";
            
        String two = s + ")";
        
        generator(one, counter1 + 1, counter2, n);
        generator(two, counter1,counter2 + 1, n);
        }
        
    } 
    
}