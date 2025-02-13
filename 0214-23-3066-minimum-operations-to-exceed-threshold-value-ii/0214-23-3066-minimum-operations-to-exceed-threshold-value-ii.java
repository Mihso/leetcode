class Solution {
    public int minOperations(int[] nums, int k) {
        Queue<Long> queue = new PriorityQueue<>();
        for(int i: nums){
            queue.add((long)i);
        }
        int counter = 0;
        long current = queue.peek();
        if(current >= k){
            return counter;
        }
        while(queue.size() >= 2 && current < k){
            long first = queue.poll();
            long second = queue.poll();
            long newwer = Math.min(first, second) * 2 + Math.max(first, second);
            queue.add(newwer);
            counter += 1;
            current = queue.peek();
        }
        return counter;
    }
}