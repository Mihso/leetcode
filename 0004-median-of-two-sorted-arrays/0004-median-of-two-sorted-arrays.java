class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        List<Integer> answer= new ArrayList<>();
        while(index1 < nums1.length && index2 < nums2.length){
            if(nums1[index1] < nums2[index2]){
                answer.add(nums1[index1]);
                index1++;
            }
            else{
                answer.add(nums2[index2]);
                index2++;
            }
        }
        
        while(index1 < nums1.length){
            answer.add(nums1[index1]);
            index1++;
        }
        
        while(index2 < nums2.length){
            answer.add(nums2[index2]);
            index2++;
        }
        if(answer.size() % 2 == 0){
            return (double)(answer.get((answer.size() / 2) - 1) + answer.get(answer.size() /2)) / 2.0;
        }
        else{
            return (double)(answer.get(answer.size() / 2));
        }
    }
}