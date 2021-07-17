import java.io.*;
import java.util.PriorityQueue;

public class NUM_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            if(abs1 == abs2) return o1 > o2 ? 1 : -1;
            return abs1 - abs2;
        });

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            if (temp == 0) {
                if (heap.isEmpty()) {
                    bufferedWriter.write(0 + "\n");
                } else {
                    bufferedWriter.write(heap.poll() + "\n");
                }
            } else {
                heap.add(temp);
            }
        }
        bufferedWriter.flush();
    }
}
