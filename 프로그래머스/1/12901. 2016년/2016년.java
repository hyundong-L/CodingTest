class Solution {
    public String solution(int a, int b) {
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] mon = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;

        for (int i = 0; i < a - 1; i++) {
            result += mon[i];
        }
        
        return day[(result + b) % 7];
    }
}