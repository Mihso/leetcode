class Solution {
    public int countTriplets(int[] arr) {
        int counter = 0;
        
        for(int i = 0; i < arr.length - 1; i ++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j; k < arr.length; k++){
                    if(valid(arr, i,j,k)){
                        counter += 1;
                    }
                }
            }
        }
        return counter;
    }
    
    public boolean valid(int[] arr, int left, int middle, int right){
        int a = arr[left];
        int b = arr[middle];
        for(int i = left + 1; i < middle; i++){
            a = a ^ arr[i];
        }
        for(int j = middle + 1; j <= right; j++){
            b = b ^ arr[j];
        }
        
        return a == b;
    }
}