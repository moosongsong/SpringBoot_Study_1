import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUM_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] ary = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(ary);
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += ary[i] * (n - i);
        }
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.close();
        bufferedReader.close();
    }
}
