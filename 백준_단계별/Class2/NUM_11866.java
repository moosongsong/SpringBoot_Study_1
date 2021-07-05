import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUM_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        stringBuilder.append('<');

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }

        while (true){
            for (int i = 1; i < k; i++) {
                queue.add(queue.poll());
            }
            stringBuilder.append(queue.poll());
            if (queue.isEmpty()){
                break;
            }
            stringBuilder.append(", ");
        }

        stringBuilder.append('>');
        System.out.println(stringBuilder);
    }
}
