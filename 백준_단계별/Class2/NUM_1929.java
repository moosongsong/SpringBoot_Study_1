import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NUM_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        StringBuilder stringBuilder = new StringBuilder();
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = m; i <= n; i++) {
            boolean isOdd = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isOdd = false;
                    break;
                }
            }
            if (isOdd) {
                stringBuilder.append(i).append('\n');
            }
        }
        System.out.println(stringBuilder);
    }
}
