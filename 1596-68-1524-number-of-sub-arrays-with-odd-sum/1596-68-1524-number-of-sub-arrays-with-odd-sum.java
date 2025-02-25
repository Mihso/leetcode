class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddCount = 0, prefix = 0;
        for(int i: arr){
            prefix += i;
            oddCount += prefix % 2;
        }
        oddCount += (arr.length - oddCount) * oddCount;
        return (int)(oddCount % 1_000_000_007);



    }
}