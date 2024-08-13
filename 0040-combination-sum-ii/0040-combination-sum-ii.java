class Solution {
    Set<String> store = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);
        combos(candidates, 0, target, answer, new ArrayList<Integer>());
        return answer;
        
        
    }
    
    private void combos(int[] candidates, int start, int target, List<List<Integer>> answer, List<Integer> current){
        
        String checker = "";
        for(Integer i: current){
            checker += i + "-";
        }
        if(!store.contains(checker)){
            if(summer(current) == target){
                List<Integer> copy = new ArrayList<>(current);
                answer.add(copy);
                store.add(checker);
            }
            else if(summer(current) < target){
                for(int i = start; i < candidates.length; i++){
                    current.add(candidates[i]);
                    combos(candidates, i+1, target, answer, current);
                    current.remove(current.size() - 1);
                }
            }
            store.add(checker);
        }
    }
    private int summer(List<Integer> current){
        int answer = 0;
        for(Integer i: current){
            answer += i;
        }
        return answer;
    }
}