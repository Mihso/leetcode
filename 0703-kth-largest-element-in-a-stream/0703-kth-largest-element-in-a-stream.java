class KthLargest {
    
    List<Integer> values;
    int k;

    public KthLargest(int k, int[] nums) {
        values = new ArrayList<Integer>();
        this.k = k;
        for(int i: nums){
            values.add(i);
        }
        Collections.sort(values, Collections.reverseOrder());
    }
    
    public int add(int val) {
        values.add(val);
        Collections.sort(values, Collections.reverseOrder());
        return values.get(k - 1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */