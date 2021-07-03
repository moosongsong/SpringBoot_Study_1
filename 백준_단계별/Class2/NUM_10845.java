import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUM_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;

        int n = Integer.parseInt(bufferedReader.readLine());
        MyQueue queue = new MyQueue(n);

        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            switch (stringTokenizer.nextToken()) {
                case "push":
                    queue.push(Integer.parseInt(stringTokenizer.nextToken()));
                    break;
                case "pop":
                    stringBuilder.append(queue.pop()).append('\n');
                    break;
                case "front":
                    stringBuilder.append(queue.front()).append('\n');
                    break;
                case "back":
                    stringBuilder.append(queue.back()).append('\n');
                    break;
                case "size":
                    stringBuilder.append(queue.size()).append('\n');
                    break;
                case "empty":
                    stringBuilder.append(queue.isEmpty()).append('\n');
                    break;
            }
        }
        System.out.println(stringBuilder);
    }

    static class MyQueue {
        private final int[] ary;
        private int size;
        private int front;
        private int back;

        MyQueue(int num) {
            this.size = 0;
            this.front = 0;
            this.back = 0;
            this.ary = new int[num];
        }

        void push(int x) {
            ary[back] = x;
            back++;
            size++;
        }

        int pop() {
            if (size == 0) {
                return -1;
            } else {
                size--;
                return ary[front++];
            }
        }

        int size() {
            return this.size;
        }

        int isEmpty() {
            if (this.size == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int front() {
            if (this.size == 0) {
                return -1;
            } else {
                return this.ary[front];
            }
        }

        int back() {
            if (this.size == 0) {
                return -1;
            } else {
                return this.ary[back - 1];
            }
        }
    }
}
