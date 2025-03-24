class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a,b) -> a[0] - b[0]);
        int index = 0;
        int answer = days;
        int current = 0;
        while(index < meetings.length){
            int[] meeting = meetings[index];
            boolean already = true;
            if(meeting[0] > current){
                current = meeting[0];
                already = false;
            }
            if(already){
                answer -= meeting[1] - current;
            }
            else{
                answer -= meeting[1] - current + 1;
            }
            // System.out.println(answer);
            // System.out.println(Arrays.toString(meeting));
            current = meeting[1];
            while(index < meetings.length && meetings[index][1] <= current){
                index += 1;
            }
        }
        return answer;
    }
}