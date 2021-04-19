package greedy;

// 1이 될때까지
// N이 1이 될때까지
// N에서 1을 빼거나, N을 K로 나눈다.

import java.util.Scanner;

public class Greedy_4 {
    public int solution() {
        int N, K, count = 0;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();

        while (N != 1) {
            if (N % K == 0) {
                N = N / K;
            } else {
                N -= 1;
            }
            count++;
        }
        return count;
    }
}
