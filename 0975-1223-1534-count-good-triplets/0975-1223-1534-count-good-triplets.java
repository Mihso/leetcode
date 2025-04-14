class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int answer = 0;
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                if(Math.abs(arr[i] - arr[j]) <= a){
                    for(int y = j + 1; y < arr.length; y++){
                        if(Math.abs(arr[j] - arr[y]) <= b && Math.abs(arr[i] - arr[y]) <= c){
                            answer += 1;
                        }
                    }
                }
            }
        }
        return answer;
    }
}