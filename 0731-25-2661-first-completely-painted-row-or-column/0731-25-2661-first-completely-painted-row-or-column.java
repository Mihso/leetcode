class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] rows = new int[mat.length];
        int[] cols = new int[mat[0].length];
        int answer = arr.length;
        Map<Integer, Integer> mapper = new HashMap<>();
        for(int a = 0; a < arr.length; a++){
            mapper.put(arr[a], a);
        }

        for(int x = 0; x < mat.length; x++){
            for(int y = 0; y < mat[x].length; y++){
                mat[x][y] = mapper.get(mat[x][y]);
            }
        }

        for(int x = 0; x < mat.length; x++){
            int highest = 0;
            for(int y = 0; y < mat[x].length; y++){
                highest = Math.max(highest, mat[x][y]);
            }
            answer = Math.min(answer, highest);
        }

        for(int y = 0; y < mat[0].length; y++){
            int highest = 0;
            for(int x = 0; x < mat.length; x++){
                highest = Math.max(highest, mat[x][y]);
            }
            answer = Math.min(answer, highest);
        }


        return answer;
    }
}