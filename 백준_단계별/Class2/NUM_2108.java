import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUM_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] ary = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 100000;
        int mode = 100000;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine().trim());
            sum += temp;
            ary[temp + 4000]++;
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }

        int countForMedian = 0;
        int mode_max = 0;
        boolean flag = false;
        for (int i = min + 4000; i <= max + 4000; i++) {
            if (ary[i] > 0) {
                if (countForMedian < (n + 1) / 2) {
                    countForMedian += ary[i];
                    median = i - 4000;
                }

                if (mode_max < ary[i]) {
                    mode_max = ary[i];
                    mode = i - 4000;
                    flag = true;
                } else if (mode_max == ary[i] && flag) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        System.out.println((int) Math.round((double) sum / n));    // 산술평균
        System.out.println(median);    // 중앙값
        System.out.println(mode);    // 최빈값
        System.out.println(max - min);    // 범위
    }
}
