//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        List<Integer> list=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int[] list1 = new int[9];
        int max = -1;
        int index = -1;

        for (int i = 0; i < 9; i++) {   //입력
            list1[i]=scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < 9; i++) {
            if (list1[i] > max) {
                max = list1[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);
    }
}