import java.io.*;

public class NUM_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }

        bufferedWriter.write(String.valueOf(count));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
