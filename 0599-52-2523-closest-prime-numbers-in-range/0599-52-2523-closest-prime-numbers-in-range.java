class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] primes = new boolean[right + 1];
        Arrays.fill(primes, true);

        primes[0] = primes[1] = false;

        for(int i = 2; i * i <= right; i++){
            if(primes[i]){
                for(int j = i * i; j <= right; j += i){
                    primes[j] = false;
                }
            }
        }
        List<Integer> primeValues = new ArrayList<>();

        for(int i = left; i <= right; i++){
            if(primes[i]){
                primeValues.add(i);
            }
        }

        if(primeValues.size() < 2){
            return new int[]{-1,-1};
        }
        int[] pair = new int[2];
        int maxi = Integer.MAX_VALUE;
        for(int i = 0; i < primeValues.size() - 1; i++){
            int diff = primeValues.get(i + 1) - primeValues.get(i);
            if(diff < maxi){
                maxi = diff;
                pair = new int[]{primeValues.get(i), primeValues.get(i+1)};
            }
        }
        return pair;

    }
}