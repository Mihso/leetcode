class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        List<Integer> vals = new ArrayList<>();
        
        for(int i = 0; i < arr2.length; i++){
            for(int y = 0; y < arr1.length; y++){
                if(arr2[i] == arr1[y]){
                    vals.add(arr2[i]);
                    arr1[y] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != -1){
                vals.add(arr1[i]);
            }
        }
        
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = vals.get(i);
        }
        
        return arr1;
    }
}