class Solution {
    boolean solution(String s) {
        int cnt_p = 0, cnt_y = 0;

        for (int i = 0; i < s.length(); i++) {
            char character = s.toLowerCase().charAt(i);

            if (character == 'p') cnt_p += 1;
            else if (character == 'y') cnt_y += 1;
        }

        return cnt_p == cnt_y;
    }
}