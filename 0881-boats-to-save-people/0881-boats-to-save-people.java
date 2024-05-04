class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int answer = 0;
        
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right){
            if(people[right]+people[left] > limit){
                answer += 1;
                right -= 1;
            }
            else if(people[right]+people[left] <= limit){
                left += 1;
                right -= 1;
                answer+=1;
            }
        }
        
        return answer;
    }
}