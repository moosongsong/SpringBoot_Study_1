package implementation;

import java.util.Scanner;

public class Implementation_4 {
    static final int NORTH = 0;
    static final int WEST = 3;
    int row, col, x, y, z, count = 0;
    int sea = 1, earth = 0, visited = 2;
    int[] x_path = new int[]{0, 1, 0, -1};
    int[] y_path = new int[]{-1, 0, 1, 0};
    int[][] map;

    void turn() {
        if (z == NORTH)
            z = WEST;
        else
            z -= 1;
    }

    boolean canItVisited() {
        int x_result = x + x_path[z];
        int y_result = y + y_path[z];
        if (y_result < row && y_result >= 0 && x_result < col && x_result >= 0)
            if (map[x_result][y_result] == earth) {
                count++;
                map[x_result][y_result] = visited;
                x = x_result;
                y = y_result;
                return true;
            }
        return false;
    }

    boolean goBack() {
        int temp;
        if (z < 2)
            temp = z + 2;
        else
            temp = z - 2;

        int x_result = x + x_path[temp];
        int y_result = y + y_path[temp];

        if (y_result < row && y_result >= 0 && x_result < col && x_result >= 0)
            if (map[x_result][y_result] != sea) {
                x = x + x_path[temp];
                y = y + y_path[temp];
                return true;
            }
        return false;
    }

    public int solution() {
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        col = scanner.nextInt();
        y = scanner.nextInt();
        x = scanner.nextInt();
        z = scanner.nextInt();

        map = new int[row][col];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                map[i][j] = scanner.nextInt();

        while (true) {
            int i = 0;
            for (i = 0; i < 4; i++) {
                turn();
                if (canItVisited())
                    break;
            }

            if (i == 4)
                if (!goBack())
                    return count;
        }
    }
}
