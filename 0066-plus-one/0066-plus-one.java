class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int carry = 1;
        while(i >= 0){
            digits[i] += carry;
            if(digits[i] == 10){
                digits[i] = 0;
                carry = 1;
            }
            else{
                carry = 0;
            }
            i--;
        }
        
        if(carry == 1){
            int[] answer = new int[digits.length + 1];
            answer[0] = 1;
            
            for(int x = 1; x < answer.length; x++){
                answer[x] = digits[x - 1];
            }
            
            return answer;
            
        }
        return digits;
        
        
    }
}