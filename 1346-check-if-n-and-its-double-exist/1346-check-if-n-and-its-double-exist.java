class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length - 1; i++){
            for(int y = i + 1; y < arr.length; y++){
                if(arr[i]*2 == arr[y] || arr[i]/2.0 == arr[y]){
                    System.out.println(arr[i]);
                    return true;
                }
            }
        }
        return false;
        
    }
}