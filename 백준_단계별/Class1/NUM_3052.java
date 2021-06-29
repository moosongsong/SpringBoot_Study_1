import java.util.Scanner;

public class NUM_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] remain = new boolean[42];

        for (int i = 0; i < 10; i++) {
            int temp = scanner.nextInt();
            remain[temp % 42] = true;
        }

        int result = 0;
        for (boolean b : remain) {
            if (b) {
                result++;
            }
        }

        System.out.println(result);
    }
}
