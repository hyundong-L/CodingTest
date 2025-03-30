import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int temp : ingredient) {
            list.add(temp);
            
            int listSize = list.size();
            if (listSize >= 4) {
                if (
                    list.get(listSize - 1).equals(1) &&
                    list.get(listSize - 2).equals(3) &&
                    list.get(listSize - 3).equals(2) &&
                    list.get(listSize - 4).equals(1)
                   ) {
                    answer++;
                    for (int i = 0; i < 4; i++) {
                        list.remove(list.size() - 1);
                    }
                }
            }
        }
        
        return answer;
    }
}