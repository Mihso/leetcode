class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int answer = 0;
        for(int i = 1; i <= colors.length; i++){
            if(colors[i % colors.length] == colors[(i - 1) % colors.length]){
                int longest = 1;
                int index = i % colors.length;
                int next = (i + 1) % colors.length;
                while(colors[index] != colors[next]){
                    longest += 1;
                    index = next;
                    next = (index + 1) % colors.length;
                }
                if(longest >= k){
                    answer += longest - k + 1;
                }
            }
        }
        if(answer == 0){
            int longest = 1;
            int index = 0;
            int next = 1;
            while(next < colors.length && colors[index] != colors[next]){
                longest += 1;
                index += 1;
                next += 1;
            }
            if(longest >= k){
                return colors.length;
            }
        }
        return answer;
    }
}