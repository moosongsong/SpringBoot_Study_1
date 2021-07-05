import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUM_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        int range = 10000000;
        int[] count = new int[(range+1)*2];

        int n = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(stringTokenizer.nextToken()) + range] += 1;
        }

        int m = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < m; i++) {
            stringBuilder.append(count[Integer.parseInt(stringTokenizer.nextToken()) + range]);
            stringBuilder.append(' ');
        }
        System.out.println(stringBuilder);
    }
}
