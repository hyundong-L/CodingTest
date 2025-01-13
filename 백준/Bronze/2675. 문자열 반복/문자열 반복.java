import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            String s = sc.nextLine();
            char[] chars = s.toCharArray();

            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                if(c != ' ') {
                    for (int i = 0; i < n; i++) {
                        sb.append(c);
                    }
                }
            }

            System.out.println(sb);
        }
    }
}
