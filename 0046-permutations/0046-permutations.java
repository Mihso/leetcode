class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> vals = new ArrayList<>();
        
        for(int i: nums){
            vals.add(i);
        }
        
        per(new ArrayList<Integer>(), vals);
        
        return answer;
        
    }
    
    public void per(List<Integer> current, List<Integer> remain){
        int length = remain.size();
        int index = 0;
        if(length == 0){
            List<Integer> copy = new ArrayList<>(current);
            answer.add(copy);
        }
        while(index < length){
            int val = remain.remove(index);
            current.add(val);
            per(current, remain);
            current.remove(current.size() - 1);
            remain.add(index, val);
            index++;
        }
    }
    
}