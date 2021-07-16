import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class NUM_7576 {
    static int[][] box;
    static int[][] visited;
    static int count = 0;

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Point getLeftPoint() {
            if (y - 1 < 0) {
                return null;
            } else {
                return new Point(this.x, this.y - 1);
            }
        }

        Point getRightPoint(int maxY) {
            if (y + 1 >= maxY) {
                return null;
            } else {
                return new Point(this.x, this.y + 1);
            }
        }

        Point getUpPoint() {
            if (x - 1 < 0) {
                return null;
            } else {
                return new Point(this.x - 1, this.y);
            }
        }

        Point getDownPoint(int maxX) {
            if (x + 1 >= maxX) {
                return null;
            } else {
                return new Point(this.x + 1, this.y);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        box = new int[n][m];
        visited = new int[n][m];
        LinkedList<Point> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (box[i][j] == 1) {
                    list.add(new Point(i, j));
                }
            }
        }

        if (list.isEmpty()) {
            System.out.println(-1);
            return;
        }

        if (list.size() == m * n) {
            System.out.println(0);
            return;
        }

        for (Point point : list) {
            count = dfs(point, n, m, 1);
        }
        System.out.println(count);
    }

    public static int dfs(Point point, int maxX, int maxY, int tempCount) {
        if (visited[point.x][point.y] != 0) return tempCount;
        visited[point.x][point.y] = tempCount;

        Point up = point.getUpPoint();
        Point down = point.getDownPoint(maxX);
        Point left = point.getLeftPoint();
        Point right = point.getRightPoint(maxY);

        int max = 0;

        if (up != null && visited[up.x][up.y] == 0 && box[up.x][up.y] != -1) {
            max = Math.max(max, dfs(up, maxX, maxY, tempCount + 1));
        }
        if (down != null && visited[down.x][down.y] == 0 && box[down.x][down.y] != -1) {
            max = Math.max(max, dfs(down, maxX, maxY, tempCount + 1));
        }
        if (left != null && visited[left.x][left.y] == 0 && box[left.x][left.y] != -1) {
            max = Math.max(max, dfs(left, maxX, maxY, tempCount + 1));
        }
        if (right != null && visited[right.x][right.y] == 0 && box[right.x][right.y] != -1) {
            max = Math.max(max, dfs(right, maxX, maxY, tempCount + 1));
        }

        return Math.max(max, tempCount + 1);

    }

}
