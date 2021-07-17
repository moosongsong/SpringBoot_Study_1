import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NUM_11724 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 0; i < n + 1; i++)
            list.add(new ArrayList<>());


        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        visited = new boolean[n + 1];
        int count = 0;
        for (int i = 1; i < list.size(); i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean dfs(int i) {
        if (visited[i]) {
            return false;
        }
        visited[i] = true;
        for (int j = 0; j < list.get(i).size(); j++) {
            dfs(list.get(i).get(j));
        }
        return true;
    }
}
