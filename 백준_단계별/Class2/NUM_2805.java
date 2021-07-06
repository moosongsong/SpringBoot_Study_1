import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUM_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] trees = new int[n];
        int max = 0;
        for (int i = 0; i < trees.length; i++) {
            trees[i] = Integer.parseInt(stringTokenizer.nextToken());
            max = Math.max(max, trees[i]);
        }

        long start = 0;
        long end = max;
        long mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            long sum = 0;
            for (int tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }
            if (sum >= m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);

    }
}