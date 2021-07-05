import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUM_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int k = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        int[] ary = new int[k];
        for (int i = 0; i < k; i++) {
            ary[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(ary);

        for (int i = ary[0]; i > 0; i--) {
            int temp = 0;
            for (int value : ary) {
                temp += value / i;
            }
            if (temp >= n) {
                System.out.println(i);
                break;
            }
        }

    }
}
