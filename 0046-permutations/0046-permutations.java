class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        Set<Integer> options = new HashSet<>();
        for(int i: nums){
            options.add(i);
        }
        process(new ArrayList<Integer>(), options);
        return answer;
    }
    
    public void process(List<Integer> current, Set<Integer> options){
        if(options.isEmpty()){
            List<Integer> copier = new ArrayList<>(current); 
            answer.add(copier);
        }
        for(int i: options){
            Set<Integer> copy = new HashSet<>(options);
            current.add(i);
            copy.remove(i);
            process(current, copy);
            current.remove(current.size() - 1);
        }
    }
}