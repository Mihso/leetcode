class Solution {
    
    List<List<Integer>> answer = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        
        for(int i: nums){
            numbers.add(i);
        }
        subSets(numbers, new ArrayList<Integer>());
        return answer;
    }
    
    public void subSets(List<Integer> nums, List<Integer> start){
        answer.add(start);
        if(nums.size() != 0){
        while(nums.size() > 0){
            ArrayList<Integer> copy = new ArrayList<>();
            copy.addAll(start);
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.addAll(nums);
            int value = nums.get(0);
            copy.add(value);
            numbers.remove(0);
            subSets(numbers, copy);
            nums.remove(0);
        }
        }
    }
}