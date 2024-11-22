class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        // Map to store frequency of each pattern
        Map<String, Integer> patternFrequency = new HashMap<>();

        for (int[] currentRow : matrix) {
            String s = "";

            // Convert row to pattern relative to its first element
            for (int col = 0; col < currentRow.length; col++) {
                // 'T' if current element matches first element, 'F' otherwise
                if (currentRow[0] == currentRow[col]) {
                    s += "T";
                } else {
                    s += "F";
                }
            }

            // Convert pattern to string and update its frequency in map
            patternFrequency.put(
                s,
                patternFrequency.getOrDefault(s, 0) + 1
            );
        }

        // Find the pattern with maximum frequency
        int maxFrequency = 0;
        for (int frequency : patternFrequency.values()) {
            maxFrequency = Math.max(frequency, maxFrequency);
        }

        return maxFrequency;
    }
}