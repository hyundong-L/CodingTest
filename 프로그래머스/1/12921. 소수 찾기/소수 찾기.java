class Solution {
    public int solution(int n) {
        int answer = 0;
        int check=0;
        
        for(int i=2;i<=n;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    check=1;
                    break;
                }
            }
            if(check!=1) answer++;
            check=0;
        }
        
        return answer;
    }
}