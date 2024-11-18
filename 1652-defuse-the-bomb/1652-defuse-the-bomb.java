class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] answer = new int[code.length];
        for(int i = 0; i < answer.length; i++){
            if(k > 0){
                int summer = 0;
                for(int x = 1; x <= k; x++){
                    summer += code[(i + x) % code.length];
                }
                answer[i] = summer;
            }
            else if(k < 0){
                int summer = 0;
                for(int x = 1; x <= Math.abs(k); x++){
                    int index = (i- x) % code.length;
                    if(index < 0){
                        index = code.length + index;
                    }
                    summer += code[index];
                }
                answer[i] = summer;
            }
            else{
                answer[i] = 0;
            }
        }
        return answer;
    }
}