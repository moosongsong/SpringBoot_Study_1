import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUM_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int total = Integer.parseInt(bufferedReader.readLine());
        int[] ary = new int[total];
        for (int i = 0; i < total; i++) {
            ary[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(ary);
        for (int i = 0; i < total; i++) {
            stringBuilder.append(ary[i]);
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }
}
