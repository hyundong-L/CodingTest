class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] list = new int[n + 1];

        for (int i = 0; i <= n; i++) {  //2~입력 받은 수 리스트에 받기 -> 소수가 아닌 것들 지울 때 편하려고
            list[i] = i;
        }

        //0, 1은 볼 필요 없으니 지움
        list[0] = -1;
        list[1] = -1;

        for (int i = 2; i <= n; i++) {  //2부터 확인
            if (list[i] == -1) {
                continue;
            }
            for (int j = i * 2; j <= n; j+=i) { //배수들 제외
                list[j] = -1;
            }
        }

        for (int i = 0; i <= n; i++) {  //소수 개수 확인
            if (list[i] != -1) {
                answer++;
            }
        }
        
        return answer;
    }
}