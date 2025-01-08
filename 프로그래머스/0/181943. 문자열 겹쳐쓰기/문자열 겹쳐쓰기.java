class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        answer = my_string.substring(0, s);
        String temp = my_string.substring(s + overwrite_string.length());
        
        answer = answer.concat(overwrite_string);
        answer = answer.concat(temp);

        return answer;
    }
}