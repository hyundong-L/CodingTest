import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hashmap = new HashMap<>();
        
        for (String s : participant) {
            hashmap.put(s, hashmap.getOrDefault(s, 0) + 1);
        }
        
        for (String s : completion) {
            hashmap.put(s, hashmap.get(s) - 1);
            hashmap.remove(s, 0);
        }
        
        answer = hashmap.keySet().iterator().next();
        
        return answer;
    }
}