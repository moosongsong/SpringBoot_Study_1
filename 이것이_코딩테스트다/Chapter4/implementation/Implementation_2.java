package implementation;

// 시각
// 정수 N 3이 하나라도 포함되는 모든 경우의 수

import java.util.Scanner;

public class Implementation_2 {
    public int solution() {
        int N, count = 0;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (int i = 0; i < 60; i++) {
            if (i / 10 == 3 || i % 10 == 3)
                count += 60;
            else {
                for (int j = 0; j < 60; j++) {
                    if (j / 10 == 3 || j % 10 == 3)
                        count++;
                }
            }
        }

        if (N >= 3)
            count += (N - 1) * count + 60 * 60;
        else
            count += N * count;

        return count;
    }
}
