import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUM_16466 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] tickets = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            tickets[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(tickets);
        int count = 0;
        for (int ticket : tickets) {
            if (++count != ticket) break;
        }
        if (count == n){
            bufferedWriter.write(String.valueOf(count+1));
        }else {
            bufferedWriter.write(String.valueOf(count));
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
