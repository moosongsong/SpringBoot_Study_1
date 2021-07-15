import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUM_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int[] ary = new int[11];
        ary[1] = 1;
        ary[2] = 2;
        ary[3] = 4;
        for (int i = 4; i < ary.length; i++) {
            ary[i] = ary[i - 3] + ary[i - 2] + ary[i - 1];
        }

        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(ary[temp]).append('\n');
        }

        System.out.println(stringBuilder);
    }
}
