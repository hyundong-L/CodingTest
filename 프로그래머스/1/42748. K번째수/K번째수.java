import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();

        for (int[] command : commands) {
            int[] tempSliceArray = Arrays.stream(Arrays.copyOfRange(array, returnToHumanIndex(command[0]), returnToHumanIndex(command[1]) + 1)).sorted().toArray();
            int index = tempSliceArray[command[2] - 1];
            answer.add(index);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // 사람이 생각하는 순서를 배열의 인덱스로 반환
    // ex) 사람에게 1번쨰 -> 배열의 0번째 인덱스
    private int returnToHumanIndex(int index) {
        return index - 1;
    }
}