import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> list = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {  //더한 값 리스트에 넣기
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }

		//stream은 
		//sorted는 정렬
		//mapToInt는 stream을 int stream으로 변환
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}