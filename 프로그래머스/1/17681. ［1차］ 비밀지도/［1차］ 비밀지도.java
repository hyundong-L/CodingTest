import java.util.Arrays;

class Solution {
    public static String fit_length(int n, String input) {  //2진수 길이 맞추기
        String result = "";

        for (int i = 0; i < n - input.length(); i++) {
            result += "0";
        }
        return result += input;
    }
    
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int arr_len = arr1.length;
        String[] answer = new String[arr_len];
        String[] b_arr1 = new String[arr_len];
        String[] b_arr2 = new String[arr_len];
        
        Arrays.fill(answer, "");
        
        for (int i = 0; i < arr_len; i++) {
            b_arr1[i] = fit_length(n, Integer.toBinaryString(arr1[i]));
            b_arr2[i] = fit_length(n, Integer.toBinaryString(arr2[i]));
        }
        
        for (int i = 0; i < arr_len; i++) {
            for (int j = 0; j < n; j++) {
                if (b_arr1[i].charAt(j)=='0' && b_arr2[i].charAt(j) == '0') {
                    answer[i] += " ";
                } else {
                    answer[i] += "#";
                }
            }
        }
        
        return answer;
    }
}