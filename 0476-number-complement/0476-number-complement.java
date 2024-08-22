class Solution {
    public int findComplement(int num) {
        String initial = Integer.toBinaryString(num);
        String answer = "";
        for(int i = 0; i < initial.length(); i++){
            if(initial.charAt(i) == '1'){
                answer += "0";
            }
            else{
                answer += "1";
            }
        }
        return Integer.parseInt(answer, 2);
    }
}