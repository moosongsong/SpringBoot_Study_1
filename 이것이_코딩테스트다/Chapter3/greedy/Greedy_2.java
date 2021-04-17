package greedy;
// 큰수의 법칙
// 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 M 번 더하여 가장 큰수를 만드는 법칙
// 배열의 트정한 인덱스에 해당하는 수가 연속해서 K 번을 초과하여 더해질 수 없다.
// 배열의 크기 N, 숫자가 더해지는 횟수 M, 연속 최대 K

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2 {
    public int solution() {

        int N, M, K, total = 0;
        int loop, remain;
        int big1, big2;
        int[] ary;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        K = scanner.nextInt();

        ary = new int[N];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
        }

        Arrays.sort(ary);
        big1 = ary[ary.length - 1];
        big2 = ary[ary.length - 2];

        loop = M / (K + 1);
        remain = M % (K + 1);
        total += (loop * K + remain) * big1;
        total += loop * big2;

        return total;
    }
}
