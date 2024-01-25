class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long allMoney=0;
        
        for(int i=1;i<=count;i++){
            allMoney+=price*i;
        }
        answer=allMoney-money;
        if(answer<0) answer=0;
        return answer;
    }
}