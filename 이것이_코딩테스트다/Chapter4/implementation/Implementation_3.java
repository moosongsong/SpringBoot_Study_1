package implementation;

// 시각
// 정수 N 3이 하나라도 포함되는 모든 경우의 수

import java.util.Scanner;

public class Implementation_3 {
    public int solution() {
        int row, col, wide = 8, count = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        row = str.charAt(1) - '0';
        col = str.charAt(0) - 'a' + 1;

        int[] row_path = new int[]{1, 1, -1, -1, 2, 2, -2, -2};
        int[] col_path = new int[]{2, -2, 2, -2, 1, -1, 1, -1};

        for (int i = 0; i < row_path.length; i++) {
            int row_result = row + row_path[i];
            int col_result = col + col_path[i];
            if (row_result > 0 && row_result <= wide && col_result > 0 && col_result <= wide)
                count++;
        }
        return count;
    }
}
