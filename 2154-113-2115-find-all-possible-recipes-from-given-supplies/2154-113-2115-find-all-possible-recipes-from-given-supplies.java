class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> answer = new ArrayList<>();
        Set<String> valid = new HashSet<>();
        
        for(String s: supplies){
            valid.add(s);
        }
        boolean again = true;
        while(again){
            again = false;
            for(int i = 0; i < recipes.length; i++){
                if(!valid.contains(recipes[i])){
                    boolean ready = true;
                    for(String s: ingredients.get(i)){
                        if(!valid.contains(s)){
                            ready = false;
                        }
                    }
                    if(ready){
                        valid.add(recipes[i]);
                        answer.add(recipes[i]);
                        again = true;
                    }
                }
            }
        }
        return answer;
    }
}