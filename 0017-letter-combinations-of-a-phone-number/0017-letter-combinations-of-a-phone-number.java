class Solution {
    List<String> answer = new ArrayList<>();
    List<char[]> key = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        key.add(new char[]{'a','b','c'});
        key.add(new char[]{'d','e','f'});
        key.add(new char[]{'g','h','i'});
        key.add(new char[]{'j','k','l'});
        key.add(new char[]{'m','n','o'});
        key.add(new char[]{'p','q','r','s'});
        key.add(new char[]{'t','u','v'});
        key.add(new char[]{'w','x','y','z'});
        String stringer = "";
        if(digits.length() == 0){
            return answer;
        }
        combo(stringer, digits);
        return answer;
    }
    
    public void combo(String current, String getter){
        if(getter.length() == 0 && current.length() > 0){
            answer.add(current);
        }
        else{
            for(char unit: key.get(Character.getNumericValue(getter.charAt(0))-2)){      
                current = current + unit;
                combo(current, getter.substring(1, getter.length()));
                current = current.substring(0,current.length() - 1 );
                }
            }
        
    }
}