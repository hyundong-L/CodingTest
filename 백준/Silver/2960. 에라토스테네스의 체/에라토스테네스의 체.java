import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //한 줄에 두 개의 수 입력
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<>(); //2부터 n까지 정수 담을 리스트
        int min = 0;
        int check = 0;
        int out = 0;

        for (int i = 2; i <= n; i++) {  //2~n까지 모든 정수 입력
            list.add(i);
        }

        while (true) {
            //1. 리스트 내 최소값을 찾기
            //2. 최소값부터 그 배수 다 지우기
            //3. 지울 때마다 check 값을 증가, k==check일 때 출력, 종료
            min = Collections.min(list);    //1

            //2
            Iterator<Integer> iterList = list.iterator();
            while (iterList.hasNext()) {
                Integer a=iterList.next();
                if (a % min == 0) {
                    iterList.remove();
                    check++;
                    if (check == k) {   //3
                        System.out.println(a);
                        out = 1;
                        break;
                    }
                }
            }

            if (out == 1) { //while(true)를 나가기 위해 사용
                break;
            }
        }
    }
}
