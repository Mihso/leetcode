class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        double totalCost = Double.MAX_VALUE;
        double currentTotalQuality = 0;
        
        List<Pair<Double, Integer>> wageToQualityRation = new ArrayList<>();
        
        for(int i = 0; i < quality.length; i++){
            wageToQualityRation.add(new Pair<>((double) wage[i]/quality[i], quality[i]));
        }
        Collections.sort(wageToQualityRation, Comparator.comparingDouble(Pair::getKey));
        
        PriorityQueue<Integer> highestQualityWorkers = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < wage.length;i++){
            highestQualityWorkers.add(wageToQualityRation.get(i).getValue());
            currentTotalQuality += wageToQualityRation.get(i).getValue();
            
            if(highestQualityWorkers.size() > k){
                currentTotalQuality -= highestQualityWorkers.poll();
            }
            
            if(highestQualityWorkers.size() == k){
                totalCost= Math.min(totalCost, currentTotalQuality*wageToQualityRation.get(i).getKey());
            }
        }
        
        return totalCost;
    }
}