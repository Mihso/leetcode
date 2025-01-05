class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        StringBuilder stringer = new StringBuilder(s);
        int[] shifAmount = new int[s.length()];
        for(int[] shifter: shifts){
            boolean direction = shifter[2] == 1;
            int left = shifter[0];
            int right = shifter[1];
            while(left <= right){
                if(direction){
                    shifAmount[left] += 1;
                    if(left != right){
                        shifAmount[right] += 1;
                    }
                }
                else{
                    shifAmount[left] -= 1;
                    if(left != right){
                        shifAmount[right] -= 1;
                    }
                }
                left += 1;
                right -= 1;
            }
        }
        for(int i = 0; i < s.length(); i++){
            int value = stringer.charAt(i) - 'a';
            value += shifAmount[i];
            if(value < 0){
                value = 26 + (value % 26);
            }
            if(value > 25){
                value %= 26;
            }
            stringer.setCharAt(i, (char)(value + 'a'));
        }
        return stringer.toString();

    }
}