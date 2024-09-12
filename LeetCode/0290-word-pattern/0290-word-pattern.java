import java.util.Collection;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] patternSplit = pattern.split("");
        String[] inputSplit = s.split(" ");

        if (patternSplit.length != inputSplit.length) return false;

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < patternSplit.length; i++) {
            //key 존재 시 기존 값 반환
            //else null 반환 및 값 삽입
            String returnValue = map.putIfAbsent(patternSplit[i], inputSplit[i]);

            if (returnValue != null && !returnValue.equals(inputSplit[i])) return false;
        }

        /*
        중복 확인 -> abba, dog dog dog dog => false가 되어야 한다
        즉, a, b는 값이 무조건 달라야 한다
         */

        //value를 key 값으로 넣어 중복 확인?
        Collection<String> valueList = map.values();
        Map<String, String> valueDuplicateCheck = new HashMap<>();
        for (String value : valueList) {
            String returnValue = valueDuplicateCheck.putIfAbsent(value, value);

            if (returnValue != null && returnValue.equals(value)) return false;
        }

        return true;
    }
}