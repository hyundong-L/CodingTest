import java.util.Arrays;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        while (s.matches(".*[a-z].*")) {
            for (String i : word) {
                s = s.replace(i, num[Arrays.asList(word).indexOf(i)]);
            }
        }
        answer=Integer.parseInt(s);
        
        return answer;
    }
}