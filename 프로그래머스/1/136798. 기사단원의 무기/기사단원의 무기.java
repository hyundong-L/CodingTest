import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            list.add(calDivisor(i));
        }
        
        for (int i : list) {
            if (i > limit) {
                answer += power;
            } else {
                answer += i;
            }
        }
        
        return answer;
    }
    
    private int calDivisor(int num) {
        int cnt = 0;
        
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                cnt++;
            } else if (num % i == 0) {
                cnt += 2;
            }
        }
        
        return cnt;
    }
}