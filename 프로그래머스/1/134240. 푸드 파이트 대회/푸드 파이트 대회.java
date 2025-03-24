class Solution {
    public static String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            answer.append(String.valueOf(i).repeat(food[i] / 2));
        }
        
        return answer + "0" + new StringBuilder(answer).reverse();
    }
}