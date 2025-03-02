class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> answer = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while(index1 < nums1.length && index2 < nums2.length){
            int[] set1 = nums1[index1];
            int[] set2 = nums2[index2];
            if(set1[0] == set2[0]){
                answer.add(new int[] {set1[0], set1[1] + set2[1]});
                index1 += 1;
                index2 += 1;
            }
            else if(set1[0] < set2[0]){
                answer.add(set1);
                index1 += 1;
            }
            else{
                answer.add(set2);
                index2 += 1;
            }
        }

        while(index1 < nums1.length){
            answer.add(nums1[index1]);
            index1 += 1;
        }
        while(index2 < nums2.length){
            answer.add(nums2[index2]);
            index2 += 1;
        }
        int[][] finaly = new int[answer.size()][2];
        return answer.toArray(finaly);
    }
}