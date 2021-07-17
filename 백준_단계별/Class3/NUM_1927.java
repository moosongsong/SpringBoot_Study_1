import java.io.*;
import java.util.PriorityQueue;

public class NUM_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            if (temp == 0) {
                if (minHeap.isEmpty()) {
                    bufferedWriter.write(0 + "\n");
                } else {
                    bufferedWriter.write(minHeap.poll() + "\n");
                }
            } else {
                minHeap.add(temp);
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
