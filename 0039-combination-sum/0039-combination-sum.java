class Solution {
    ArrayList<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> empty = new ArrayList<>();
        Arrays.sort(candidates);
        checker(candidates, target, empty, 0);
        return answer;
    }
    
    public void checker(int[] candidates, int target, List<Integer> current, int index){
        if(target == 0){
            if(!answer.contains(current)){
                answer.add(new ArrayList<>(current));
            }
        }
        else if(target > 0){
            for(int i = index; i< candidates.length; i++){
                if(candidates[i] <= target){
                current.add(candidates[i]);
                checker(candidates, target - candidates[i], current, i);
                current.remove(current.size()-1);
            }
            }
        }
    }
}