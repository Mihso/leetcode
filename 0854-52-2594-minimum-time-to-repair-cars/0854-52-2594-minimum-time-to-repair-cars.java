class Solution {

    public boolean timeIsSuff(int[] ranks, int cars, long minGiven) {
        long carsDone = 0;
        for (int r : ranks) {
            long c2 = minGiven / r;
            long c = (long) Math.sqrt(c2);
            carsDone += c;
        }
        return carsDone >= cars;
    }

    public long repairCars(int[] ranks, int cars) {
        long l = 1, r = (long) 1e14;
        while (l < r) {
            long mid = (l + r) / 2;
            if (timeIsSuff(ranks, cars, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    // public long repairCars(int[] ranks, int cars) {
    //     long[][] maxer = new long[ranks.length][cars];
    //     int[] minutes = new int[ranks.length];
    //     Arrays.fill(minutes, 0);
    //     for(int i = 0; i < maxer.length; i++){
    //         for(int y = 0; y < cars; y++){
    //             maxer[i][y] = ranks[i] * (y + 1) * (y + 1);
    //         }
    //     }

    //     long count = 1;
    //     while(cars > 0){
    //         for(int i = 0; i < minutes.length; i++){
    //             if(count == maxer[i][minutes[i]]){
    //                 cars -= 1;
    //                 minutes[i] += 1;
    //             }
    //         }
    //         count += 1;
    //     }
    //     long answer = 0;
    //     for(int x = 0; x < minutes.length; x++){
    //         if(minutes[x] > 0){
    //             answer = Math.max(answer, maxer[x][minutes[x] - 1]);
    //         }
    //     }

    //     return answer;
    // }
}