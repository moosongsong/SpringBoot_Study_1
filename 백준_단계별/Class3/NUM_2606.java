import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NUM_2606 {
    public static ArrayList<ArrayList<Integer>> map = new ArrayList<>();
    public static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int n = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());

        visited = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            map.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            map.get(x).add(y);
            map.get(y).add(x);
        }

        dfs(1);
        System.out.println(count);

    }

    public static void dfs(int x) {
        if (visited[x]) return;
        visited[x] = true;
        for (int i = 0; i < map.get(x).size(); i++) {
            int y = map.get(x).get(i);
            if (!visited[y]) {
                count++;
                dfs(y);
            }
        }
    }
}
