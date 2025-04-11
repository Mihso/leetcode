class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int answer = 0;
        for(int i = low; i <= high; i++){
            String current = Integer.toString(i);
            if(current.length() % 2 == 0){
                int left = 0;
                int right = current.length() - 1;
                int sum1 = 0;
                int sum2 = 0;
                while(left < right){
                    sum1 += Integer.valueOf(current.charAt(left));
                    sum2 += Integer.valueOf(current.charAt(right));
                    left += 1;
                    right -= 1;
                }
                if(sum1 == sum2){
                    answer += 1;
                }
            }
        }
        return answer;
    }
}