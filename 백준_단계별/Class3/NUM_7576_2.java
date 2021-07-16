import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Tomato {
    int x;
    int y;

    Tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class NUM_7576_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int[][] box = new int[n][m];
        int[][] visited = new int[n][m];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<Tomato> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < m; j++) {
                int temp = Integer.parseInt(stringTokenizer.nextToken());
                box[i][j] = temp;
                if (temp == 0) {
                    visited[i][j] = -1;
                } else if (temp == 1) {
                    queue.offer(new Tomato(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Tomato now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                    continue;
                if (visited[nx][ny] >= 0)
                    continue;
                visited[nx][ny] = visited[now.x][now.y] + 1;
                queue.offer(new Tomato(nx, ny));
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == -1) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, visited[i][j]);
            }
        }

        System.out.println(max);

    }
}
