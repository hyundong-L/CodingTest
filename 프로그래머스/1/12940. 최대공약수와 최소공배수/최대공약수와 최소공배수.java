class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        int saved = 0;

        for (int i = 1; i <= min; i++) {
            if (max % i == 0 && min % i == 0) {
                saved = i;
            }
        }
        int[] answer = {saved, max * min / saved};
        
        return answer;
    }
}