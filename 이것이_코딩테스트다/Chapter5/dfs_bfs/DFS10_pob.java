package dfs_bfs;

import java.util.Scanner;

public class DFS10_pob {
    int N, M; //n:row, M:col
    int[][] map;

    public boolean dfs(int row, int col) {
        if (row < 0 || row >= N || col < 0 || col >= N) {
            return false;
        }
        if (map[row][col] == 0) {
            map[row][col] = 1;
            dfs(row - 1, col);//위
            dfs(row + 1, col);//아래
            dfs(row, col - 1);//왼
            dfs(row, col + 1);//오
            return true;
        }
        return false;
    }

    public void solution() {
        int result = 0;
        initialize();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }

    public void initialize() {
        String str_temp;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            str_temp = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str_temp.charAt(j) - '0';
            }
        }
    }
}
