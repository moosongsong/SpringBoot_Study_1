import java.util.Scanner;

public class NUM_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[10];
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= scanner.nextInt();
        }

        String str = Integer.toString(result);
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - '0'] += 1;
        }

        for (int j : count) {
            System.out.println(j);
        }
    }
}
