class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long lowest = 0;
        long highest = 0;
        long current = 0;
        for(int i: differences){
            current += i;
            lowest = Math.min(current, lowest);
            highest = Math.max(current, highest);
        }
        return (int) Math.max((upper - lower) - (highest - lowest)  + 1, 0);
    }
}