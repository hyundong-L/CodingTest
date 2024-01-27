import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());  //입력 받을 회의 시간의 개수
        int[][] timeList = new int[cnt][2]; //모든 회의 시간 시작, 끝 시간 저장

        int endTime;
        int canUseSpaceCnt = 0; //사용 가능한 회의 개수

        for (int i = 0; i < cnt; i++) { //시간 입력
            String[] inputTime = br.readLine().split(" ");

            timeList[i][0] = Integer.parseInt(inputTime[0]);
            timeList[i][1] = Integer.parseInt(inputTime[1]);
        }

        //끝나는 시간 기점으로 정렬
        Arrays.sort(timeList, (o1, o2) -> {
            if(o1[1] == o2[1]) return o1[0] - o2[0];    //끝 시간 같으면 시작 시간 빠른 것부터
            return o1[1] - o2[1];
        });

        endTime = timeList[0][1];   //1번째 사용 끝 시간
        canUseSpaceCnt++;

        for (int i = 1; i < cnt; i++) {
            if (endTime <= timeList[i][0]) {  //1번째 사용 끝 시간과 2번째 사용 시작 시간이 겹치지 않으면 추가
                endTime = timeList[i][1];
                canUseSpaceCnt++;
            }
        }

        System.out.println(canUseSpaceCnt);

        //입력 확인용
//        for (int i = 0; i < timeList.length; i++) {
//            System.out.println(timeList[i][0] + " | " + timeList[i][1]);
//        }
    }
}