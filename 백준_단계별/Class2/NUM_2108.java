import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUM_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] ary = new int[n];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = Integer.parseInt(bufferedReader.readLine().trim());
        }
        Arrays.sort(ary);
        stringBuilder.append(average(ary)).append('\n');
        stringBuilder.append(ary[ary.length / 2]).append('\n');
        stringBuilder.append(many(ary)).append('\n');
        stringBuilder.append(ary[ary.length - 1] - ary[0]).append('\n');
        System.out.println(stringBuilder);
    }

    public static long average(int[] ary) {
        int result = 0;

        for (int j : ary) {
            result += j;
        }

        return Math.round((double) result / (double) ary.length);
    }

    public static int many(int[] ary) {
        if (ary.length == 1) {
            return ary[0];
        }
        int[] count = new int[10001];
        int max = 0;
        for (int i = 0; i < ary.length; i++) {
            count[ary[i] + 5000] += 1;
            max = Math.max(max, count[ary[i] + 5000]);
        }
        int result = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                result++;
            }
            if (result == 2) {
                result = i - 5000;
                break;
            }
        }
        return result;
    }
}
