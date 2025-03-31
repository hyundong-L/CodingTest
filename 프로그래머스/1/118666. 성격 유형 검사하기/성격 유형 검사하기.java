import java.util.Map;
import java.util.HashMap;

class Solution {
    public static String solution(String[] survey, int[] choices) {
        Character[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : type) {
            map.put(c, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            char leftType = survey[i].charAt(0);
            char rightType = survey[i].charAt(1);
            int score = choices[i] - 4;

            if (score < 0) {
                map.put(leftType, map.get(leftType) - score);
            } else {
                map.put(rightType, map.get(rightType) + score);
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < type.length; i += 2) {
            char leftType = type[i];
            char rightType = type[i + 1];

            answer.append(
                    map.get(leftType) >= map.get(rightType) ? leftType : rightType
            );
        }

        return answer.toString();
    }
}