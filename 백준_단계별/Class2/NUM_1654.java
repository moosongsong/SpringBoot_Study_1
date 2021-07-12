import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUM_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int k = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        int[] ary = new int[k];
        for (int i = 0; i < k; i++)
            ary[i] = Integer.parseInt(bufferedReader.readLine());

        Arrays.sort(ary);

        long max = ary[k - 1];
        long min = 1;
        long middle;

        while (max >= min) { // 이분탐색 시작
            middle = (max + min) / 2;
            long temp = 0;

            for (int i : ary)
                temp += i / middle;

            if (temp >= n)
                min = middle + 1;
            else if (temp < n)
                max = middle - 1;
        }
        System.out.println(max);
    }
}
