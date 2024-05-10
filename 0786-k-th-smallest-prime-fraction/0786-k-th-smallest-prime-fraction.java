class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int left = 0;
        int right = arr.length -1;
        PriorityQueue<double[]> fractions = new PriorityQueue<>((a,b) -> Double.compare(b[0], a[0]) );
        
        for(int i = 0; i < arr.length; i++){
            fractions.offer(new double[]{(-1.0 * arr[i]) / arr[arr.length - 1], i, arr.length - 1 });
        }
        
        while(--k > 0){
            double[] current = fractions.poll();
            int numerator = (int) current[1];
            int denominator = (int) current[2] - 1;
            if(denominator > numerator){
                fractions.offer( new double[]{(-1.0 * arr[numerator]) / arr[denominator], numerator, denominator} );
            }
           
        }
        
        double[] result = fractions.poll();
        
        return new int[] {arr[(int) result[1]],arr[ (int) result[2]]};
        
    }
}