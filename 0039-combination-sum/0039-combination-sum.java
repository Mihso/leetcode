class Solution {
    ArrayList<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> empty = new ArrayList<>();
        Arrays.sort(candidates);
        checker(candidates, target, empty);
        return answer;
    }
    
    public void checker(int[] candidates, int target, List<Integer> current){
        if(target == 0){
            List<Integer> copy = new ArrayList<>();
            for(int i: current){
                copy.add(i);
            }
            Collections.sort(copy);
            if(!answer.contains(copy)){
                answer.add(copy);
            }
        }
        else if(target > 0){
            for(int c: candidates){
                current.add(c);
                checker(candidates, target - c, current);
                current.remove(current.size()-1);
            }
        }
    }
}