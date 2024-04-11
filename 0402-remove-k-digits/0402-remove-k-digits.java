class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> numbers = new Stack<>();
        char[] chars = num.toCharArray();
        int actual = 0;
        
        for(Character w: chars){
            if(!w.equals('0')){
                actual++;
            }
        }
        
        if(k >= actual){
            return "0";
        }
        int counter = k;
        for(int i = 0; i < chars.length; i ++){
            while(!numbers.isEmpty() && counter > 0 && numbers.peek() > chars[i]){
                numbers.pop();
                counter -= 1;
            }
            numbers.push(chars[i]);
        }
        
        while(!numbers.isEmpty() && counter > 0){
                numbers.pop();
                counter -= 1;
        }
        
        String answer = "";
        
        while(numbers.firstElement() == '0'){
            numbers.remove(0);
        }
        
        for(Character unit: numbers){
                answer += unit;
        }
        
        if(answer.equals(""))
        {
            return "0";
        }
        return answer;
    }
}