import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int m = sc.nextInt();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            result.append(map.getOrDefault(sc.nextInt(), 0)).append(" ");
        }

        System.out.println(result);
    }
}
