import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] type = {"R", "T", "C", "F", "J", "M", "A", "N"};
        Map<String, Integer> map = new HashMap<>();
        for (String s : type) {
            map.put(s, 0);
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] > 4) {
                map.put(String.valueOf(survey[i].charAt(1)), map.get(String.valueOf(survey[i].charAt(1)))+ choices[i] - 4);
            } else if (choices[i] < 4) {
                map.put(String.valueOf(survey[i].charAt(0)), map.get(String.valueOf(survey[i].charAt(0))) + 4 - choices[i]);
            }
        }

        for (int i = 0; i < type.length; i += 2) {
            if (map.get(type[i]) > map.get(type[i + 1])) {
                answer.append(type[i]);
            } else if (map.get(type[i]) < map.get(type[i + 1])) {
                answer.append(type[i + 1]);
            } else {
                answer.append(
                        type[i].compareTo(type[i + 1]) < 0 ? type[i] : type[i + 1]
                );
            }
        }

        return answer.toString();
    }
}