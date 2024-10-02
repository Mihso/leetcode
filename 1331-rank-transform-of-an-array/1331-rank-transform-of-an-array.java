class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> ranks = new HashMap<>();
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int rank = 1;
        for(int i = 0; i < arr.length; i++){
            if(i > 0 && copy[i] > copy[i - 1]){
                rank++;
            }
            ranks.put(copy[i], rank);
        }
        
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = ranks.get(arr[i]);
        }
        
        return arr;
        
    }
}