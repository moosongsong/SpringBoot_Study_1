package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    private int row;
    private int col;

    public Node(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

public class BFS11_prob {
    int N, M; //N:row, M:col
    int[][] map;
    int[] row_path = new int[]{-1, 1, 0, 0};//위아왼오
    int[] col_path = new int[]{0, 0, -1, 1};
    Queue<Node> queue = new LinkedList<>();

    public void solution() {
        initialize();
        bfs(0, 0);
    }

    public void bfs(int row, int col) {
        queue.add(new Node(row, col));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            row = node.getRow();
            col = node.getCol();

            for (int i = 0; i < row_path.length; i++) {
                int new_row = row + row_path[i];
                int new_col = col + col_path[i];
                if (new_row < 0 || new_row >= N || new_col < 0 || new_col >= M) {
                    continue;
                }
                if (map[new_row][new_col] == 0) {
                    continue;
                }
                if (map[new_row][new_col] == 1) {
                    map[new_row][new_col] = map[row][col] + 1;
                    queue.add(new Node(new_row, new_col));
                }
            }
        }
        System.out.println(map[N - 1][M - 1]);
    }

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        String temp;
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();

        map = new int[N][M];

        for (int i = 0; i < map.length; i++) {
            temp = scanner.nextLine();
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = temp.charAt(j) - '0';
            }
        }
    }
}
