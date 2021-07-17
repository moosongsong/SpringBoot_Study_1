import java.io.*;
import java.util.*;

public class NUM_1931 {

    static class Meeting {
        int start;
        int close;

        public Meeting(int start, int close) {
            this.start = start;
            this.close = close;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int n = Integer.parseInt(bufferedReader.readLine());

        Meeting[] ary = new Meeting[n];

        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            ary[i] = new Meeting(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        }

        Arrays.sort(ary, (o1, o2) -> {
            if (o1.close > o2.close) {
                return 1;
            } else if (o1.close < o2.close) {
                return -1;
            } else {
                return Integer.compare(o1.start, o2.start);
            }
        });

        int count = 0;
        int preEndTime = 0;
        for (int i = 0; i < n; i++) {
            if (preEndTime <= ary[i].start) {
                preEndTime = ary[i].close;
                count++;
            }
        }

        System.out.println(count);
    }
}
