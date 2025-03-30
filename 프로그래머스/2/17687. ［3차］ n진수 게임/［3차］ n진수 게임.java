class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder convert = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        int i = 0;
        while (convert.length() <= t * m) {
            convert.append(Integer.toString(i++, n).toUpperCase());
        }
        
        for (int j = p - 1; answer.length() < t; j += m) {
            answer.append(convert.charAt(j));
        }
        
        return answer.toString();
    }
}