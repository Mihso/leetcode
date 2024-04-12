class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        Set<Integer> options = new HashSet<>();
        for(int i: nums){
            options.add(i);
        }
        process(new ArrayList<Integer>(), nums);
        return answer;
    }
    
    public void process(List<Integer> current, int[] options){
        if(current.size() == options.length){
            List<Integer> copier = new ArrayList<>(current); 
            answer.add(copier);
        }
        for(int i: options){
            if(!current.contains(i)){
            current.add(i);
            process(current, options);
            current.remove(current.size() - 1);
            }
        }
    }
}