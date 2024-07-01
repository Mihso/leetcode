class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        for(int i = 0; i < arr.length - 2; i++){
            int odds = 0;
            for(int y = 0; y <3; y++){
                if(arr[i+y] % 2 != 0){
                    odds += 1;
                }
            }
            if(odds == 3)
                return true;
        }
        return false;
    }
}