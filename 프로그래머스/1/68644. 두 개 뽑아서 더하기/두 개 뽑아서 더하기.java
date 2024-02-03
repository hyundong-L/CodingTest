import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        list=list.stream().distinct().collect(Collectors.toList()); //중복 제거
        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) { //int형 배열로 옮기기
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}