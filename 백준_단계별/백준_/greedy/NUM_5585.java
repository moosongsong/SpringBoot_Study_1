package greedy;

import java.io.*;

public class NUM_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] remain = new int[]{500, 100, 50, 10, 5, 1};
        int money = 1000 - Integer.parseInt(bufferedReader.readLine());

        int count = 0;
        for (int i = 0; i < remain.length; i++) {
            count += money / remain[i];
            money %= remain[i];
        }
        bufferedWriter.write(String.valueOf(count));

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
