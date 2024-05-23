class Solution {
//     int counter = 0;
//     public int beautifulSubsets(int[] nums, int k) {
//         subber(nums, k, 0, new ArrayList<Integer>());
//         return counter;
//     }
    
//     public void subber(int[] nums,int k, int start, ArrayList<Integer> current){
//         for(int i = start; i < nums.length; i++){
//             if(current.isEmpty() || Math.abs(nums[i]-current.get(current.size() - 1) ) != k){
//                 current.add(nums[i]);
//                 counter += 1;
//                 subber(nums, k, i + 1, current);
//                 current.remove(current.size() - 1);
//             }
//         }
//     }
    
    
        public int beautifulSubsets(int[] nums, int k) {
        int totalCount = 1;

        Map<Integer, Map<Integer, Integer>> freqMap = new TreeMap<>();

        // Calculate frequencies based on remainder
        for (int num : nums) {
            int remainder = num % k;
        freqMap.computeIfAbsent(remainder, x -> new TreeMap<>())
            .merge(num, 1, Integer::sum);
        }

        // Iterate through each remainder group
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : freqMap.entrySet()) {
            int n = entry.getValue().size(); // Number of elements in the current group

            List<Map.Entry<Integer, Integer>> subsets = new ArrayList<>(
                    entry.getValue().entrySet());
            
            int[] counts = new int[n + 1]; // Array to store counts of subsets

            counts[n] = 1; // Initialize count for the last subset

            // Calculate counts for each subset starting from the second last
            for (int i = n - 1; i >= 0; i--) {

                // Count of subsets skipping the current subset
                int skip = counts[i + 1];

                // Count of subsets including the current subset
                int take = (1 << subsets.get(i).getValue()) - 1;

                // If next number has a 'difference',
                // calculate subsets; otherwise, move to next
                if (i + 1 < n && subsets.get(i + 1).getKey()
                        - subsets.get(i).getKey() == k) {
                    take *= counts[i + 2];
                } else {
                    take *= counts[i + 1];
                }

                // Store the total count for the current subset
                counts[i] = skip + take; 
            }

            totalCount *= counts[0];
        }

        return totalCount - 1;
    }
}