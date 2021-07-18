import java.io.*;
import java.util.Arrays;

public class NUM_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        long[] card = new long[n];

        for (int i = 0; i < n; i++) {
            card[i] = Long.parseLong(bufferedReader.readLine());
        }

        Arrays.sort(card);

        int max_index = 0;
        int max_count = 1;
        int now_count = 1;
        for (int i = 1; i < card.length; i++) {
            if (card[i] == card[i - 1]) {
                now_count++;
            } else {
                now_count = 1;
            }
            if (max_count < now_count) {
                max_count = now_count;
                max_index = i;
            }
        }

        bufferedWriter.write(String.valueOf(card[max_index]));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
