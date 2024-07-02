class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0;
        int index2 = 0;
        List<Integer> values = new ArrayList<>();
        while(index1 < nums1.length && index2 < nums2.length){
            if(nums1[index1] == nums2[index2]){
                values.add(nums1[index1]);
                index1++;
                index2++;
            }
            else if(nums1[index1] < nums2[index2]){
                index1++;
            }
            else if(nums1[index1] > nums2[index2]){
                index2++;
            }
        }
        
        int[] answer = new int[values.size()];
        for(int i=0; i < values.size(); i++){
            answer[i] = values.get(i);
        }
        return answer;
    }
}