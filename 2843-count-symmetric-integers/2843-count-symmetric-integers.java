class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int counter = 0;
        for(int i = low; i <= high; i++){
            String copy = String.valueOf(i);
            if(copy.length() % 2 == 0){
                boolean found = true;
                int sum1 = 0;
                int sum2 = 0;
                for(int j = 0; j < copy.length()/2; j++){
                    sum1 += Integer.valueOf(copy.charAt(j));
                    sum2 += Integer.valueOf(copy.charAt(copy.length() - 1 - j));
                }

                if(sum1 == sum2){
                    counter += 1;
                }
            }
        }
        return counter;
    }
}