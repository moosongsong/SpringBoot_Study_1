package dfs_bfs;

public class DFS8_prob {
    int[][] map = new int[][]{{0, 0, 0, 0}, {0, 2, 3, 8}, {0, 1, 7}, {0, 1, 4, 5}, {0, 3, 5}, {0, 3, 4}, {0, 7}, {0, 2, 6, 8}, {0, 1, 7}};
    int[] visited = new int[9];

    public void solution(int v) {
        visited[v] = 1;
        System.out.print(v + " ");

        for (int i = 1; i < map[v].length; i++) {
            int temp = map[v][i];

            if (visited[temp] == 0) {
                solution(temp);
            }
        }
    }
}
