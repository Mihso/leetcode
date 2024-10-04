class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int sum = 0;
        for(int i: skill){
            sum += i;
        }
        sum /= (skill.length/2);
        System.out.println(sum);
        
        long answer = 0;
        int left = 0;
        int right = skill.length - 1;
        while(left < right){
            if(skill[left] + skill[right] != sum){
                return  -1;
            }
            else{
                answer += skill[left] * skill[right];
            }
            
            left++;
            right--;
            
        }
        
        return answer;
    }
}