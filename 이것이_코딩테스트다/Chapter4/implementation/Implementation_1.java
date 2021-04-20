package implementation;

// 상하좌우

import java.util.Scanner;

public class Implementation_1 {
    public void solution() {
        int row = 1, col = 1;
        String[] ary;
        String temp_str;
        int temp_int, N;

        int[] row_path = new int[]{0, 0, -1, 1};
        int[] col_path = new int[]{-1, 1, 0, 0};
        char[] direction = new char[]{'L', 'R', 'U', 'D'};

        Scanner scanner = new Scanner(System.in);
        temp_str = scanner.nextLine();
        N = Integer.parseInt(temp_str);

        temp_str = scanner.nextLine();
        ary = temp_str.split(" ");

        for (String s : ary) {
            char ch = s.charAt(0);
            switch (ch) {
                case 'L':
                    temp_int = 0;
                    break;
                case 'R':
                    temp_int = 1;
                    break;
                case 'U':
                    temp_int = 2;
                    break;
                case 'D':
                    temp_int = 3;
                    break;
                default:
                    temp_int = -1;
                    break;
            }

            if (temp_int == -1) {
                continue;
            }

            if (!(col + col_path[temp_int] < 1 || col + col_path[temp_int] > N)) {
                col += col_path[temp_int];
            }

            if (!(row + row_path[temp_int] < 1 || row + row_path[temp_int] > N)) {
                row += row_path[temp_int];
            }
        }
        System.out.println(row + " " + col);
    }
}
