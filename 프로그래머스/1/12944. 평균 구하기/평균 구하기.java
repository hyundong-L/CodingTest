import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
//         int i;
//         double answer = 0;
        
//         for(i=0;i<=arr.length-1;i++){
//             answer += arr[i];
//         }
        
//         return answer / i;
        
        return Arrays.stream(arr).average().orElse(0);
    }
}