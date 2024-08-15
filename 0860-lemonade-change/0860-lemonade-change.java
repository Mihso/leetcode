class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] bill = new int[3];
        
        Arrays.fill(bill, 0);
        
        for(int i: bills){
            if(i == 5){
                bill[0] += 1;
            }
            else if(i == 10){
                if(bill[0] <= 0){
                    return false;
                }
                else{
                    bill[0] -= 1;
                    bill[1] += 1;
                }
            }
            else{
                bill[2] += 1;
                int value = 20;
                while(bill[1] > 0 && value > 10){
                    value -= 10;
                    bill[1] -= 1;
                }
                
                while(bill[0] > 0 && value > 5){
                    bill[0] -= 1;
                    value -= 5;
                }
                if(value != 5){
                    return false;
                }
                
            }
        }
        return true;
        
    }
}