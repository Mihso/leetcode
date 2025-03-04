class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> before = new ArrayList<>();
        List<Integer> after = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        for(int i: nums){
            if(i < pivot){
                before.add(i);
            }
            else if(i > pivot){
                after.add(i);
            }
            else{
                equal.add(i);
            }
        }

        before.addAll(equal);
        before.addAll(after);

        int[] answer = new int[nums.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = before.get(i);
        }
        return answer;

    }
}