class Solution {
    public int minimizeXor(int num1, int num2) {
        int bit1 = Integer.bitCount(num1);
        int bit2 = Integer.bitCount(num2);
        int answer = num1;
        for(int i = 0; i < 32; i++){
            if(bit1 > bit2 && ((1 << i) & num1) > 0){
                answer ^= 1 << i;
                bit1 -= 1;
            }
            if(bit1 < bit2 && ((1 << i) & num1) == 0){
                answer ^= 1 << i;
                bit1 += 1;
            }
        }
        return answer;
    }
}