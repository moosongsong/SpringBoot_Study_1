import java.io.*;

public class NUM_17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] sticks = new int[n];
        for (int i = 0; i < n; i++) {
            sticks[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int last = sticks[n - 1];
        int count = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (sticks[i]>last){
                last = sticks[i];
                count++;
            }
        }
        bufferedWriter.write(String.valueOf(count));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
