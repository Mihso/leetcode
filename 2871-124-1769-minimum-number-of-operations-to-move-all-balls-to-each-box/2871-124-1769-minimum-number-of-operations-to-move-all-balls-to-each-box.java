class Solution {
    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];
        Set<Integer> positions = new HashSet<>();
        for(int i = 0; i < answer.length; i++){
            if(boxes.charAt(i) == '1'){
                positions.add(i);
            }
        }

        for(int i = 0; i < answer.length; i++){
            int counter = 0;
            for(int position: positions){
                if(position != i){
                    counter += Math.abs(position - i);
                }
            }
            answer[i] = counter;
        }
        return answer;
    }
}