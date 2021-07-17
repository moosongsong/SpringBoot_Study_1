import java.io.*;

public class NUM_17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[] dp = new int[n + 1];
        dp[1] = 1;

        int min;
        for (int i = 2; i <= n; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                int temp = i - j * j;
                min = Math.min(min, dp[temp]);
            }
            dp[i] = min + 1;
        }

        bufferedWriter.write(dp[n] + "\n");
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
