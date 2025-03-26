class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> values = new ArrayList<>();

        for(int[] i: grid){
            for(int value: i){
                values.add(value);
            }
        }
        Collections.sort(values, (a,b) -> a - b);
        int check = values.get((values.size() / 2));
        int remainder = check % x;
        int counter = 0;
        for(int i: values){
            if(i % x != remainder){
                return -1;
            }
            counter += Math.abs(check - i) / x;
        }
        return counter;
    }
}