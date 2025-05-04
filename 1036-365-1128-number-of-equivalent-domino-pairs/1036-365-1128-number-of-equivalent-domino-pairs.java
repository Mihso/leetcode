class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> possible = new HashMap<>();
        int counter = 0;
        for(int[] i: dominoes){
            int mini = Math.min(i[0], i[1]);
            int maxi = Math.max(i[0], i[1]);
            String current = Integer.toString(mini) + Integer.toString(maxi);
            possible.put(current, possible.getOrDefault(current, 0) + 1);
        }

        for(int i: possible.values()){
            counter += i*(i - 1) / 2;
        }

        return counter;
    }
}