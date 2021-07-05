import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class NUM_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            switch (stringTokenizer.nextToken()) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(stringTokenizer.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(stringTokenizer.nextToken()));
                    break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        stringBuilder.append(-1).append('\n');
                    } else {
                        stringBuilder.append(deque.pollFirst()).append('\n');
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        stringBuilder.append(-1).append('\n');
                    } else {
                        stringBuilder.append(deque.pollLast()).append('\n');
                    }
                    break;
                case "size":
                    stringBuilder.append(deque.size()).append('\n');
                    break;
                case "empty":
                    if (deque.isEmpty()){
                        stringBuilder.append(1).append('\n');
                    }else{
                        stringBuilder.append(0).append('\n');
                    }
                    break;
                case "front":
                    if (deque.isEmpty()){
                        stringBuilder.append(-1).append('\n');
                    }else{
                        stringBuilder.append(deque.peekFirst()).append('\n');
                    }
                    break;
                case "back":
                    if (deque.isEmpty()){
                        stringBuilder.append(-1).append('\n');
                    }else {
                        stringBuilder.append(deque.peekLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(stringBuilder);
    }
}
