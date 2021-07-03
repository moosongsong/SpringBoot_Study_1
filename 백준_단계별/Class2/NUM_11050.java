import java.util.Scanner;

public class NUM_11050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int result = 1;

        for (int i = N; i > N - K; i--) {
            result *= i;
        }

        for (int i = 1; i <= K; i++) {
            result /= i;
        }

        System.out.println(result);

    }
}
