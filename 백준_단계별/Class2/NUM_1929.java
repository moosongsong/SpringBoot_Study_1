import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUM_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        StringBuilder stringBuilder = new StringBuilder();
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;

        for (int j = 2; j <= Math.sqrt(prime.length); j++) {
            if (prime[j]) continue;
            for (int i = j * j; i < prime.length; i += j) {
                prime[i] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (!prime[i]) {
                stringBuilder.append(i).append('\n');
            }
        }
        System.out.println(stringBuilder);
    }
}
