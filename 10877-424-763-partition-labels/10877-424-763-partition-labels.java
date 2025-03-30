class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> last = new HashMap<>();
        Map<Character, Integer> first = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            last.put(s.charAt(i), i);
            if(!first.containsKey(s.charAt(i))){
                first.put(s.charAt(i), i);
            }
        }

        // System.out.println(last);
        // System.out.println(first);

        List<Integer> answer = new ArrayList<>();
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(first.get(current) >= end){
                answer.add(end - start + 1);
                start = first.get(current);
                end = last.get(current);
            }
            if(last.get(current) > end && first.get(current) > start){
                end = last.get(current);
            }
        }
        answer.add(end - start + 1);
        answer.remove(0);
        return answer;
    }
}