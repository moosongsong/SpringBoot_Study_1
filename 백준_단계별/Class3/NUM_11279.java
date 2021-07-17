import java.io.*;
import java.util.PriorityQueue;

public class NUM_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> (-Integer.compare(o1, o2)));
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            if (temp ==0){
                if (heap.isEmpty()){
                    bufferedWriter.write('0'+"\n");
                }else{
                    int result = heap.poll();
                    bufferedWriter.write(String.valueOf(result)+"\n");
                }
            }else {
                heap.add(temp);
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
