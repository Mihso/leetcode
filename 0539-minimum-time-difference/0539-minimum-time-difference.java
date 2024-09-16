class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];
        
        for(int i = 0; i < timePoints.size(); i++){
            String s = timePoints.get(i);
            minutes[i] = (Integer.parseInt(s.substring(0, 2)) * 60) + (Integer.parseInt(s.substring(3))); 
            
        }
        Arrays.sort(minutes);
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < minutes.length - 1; i++){
            int diff = Math.abs(minutes[i] - minutes[i+1]);
            int value = Math.min( diff, 1440 - diff);
            answer = Math.min(answer, value);
        }
        int diff = Math.abs(minutes[minutes.length - 1] - minutes[0]);
        int value = Math.min( diff, 1440 - diff);
        answer = Math.min(answer, value);
        System.out.println(Arrays.toString(minutes));
        return answer;
        
    }
}