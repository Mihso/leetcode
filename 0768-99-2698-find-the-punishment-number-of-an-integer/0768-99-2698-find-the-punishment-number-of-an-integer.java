class Solution {
    public int punishmentNumber(int n) {
        int [] precalc = new int[] { 1,9,10,36,45,55,82,91,99,100,235,297,369,370,379,414,657,675,703,756,792,909,918,945,964,990,991,999,1000};
        int sum = 0;
        int index = 0;
        for(int i = 1; i <= n; i++){
            if(i == precalc[index]){
                sum += i * i;
                index += 1;
            }
        }

        return sum;
    }
}