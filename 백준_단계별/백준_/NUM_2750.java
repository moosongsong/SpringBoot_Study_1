import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUM_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(bufferedReader.readLine());
        int [] ary = new int[n];
        for (int i = 0; i < ary.length; i++) {
            ary[i]=Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(ary);
        for (int i = 0; i < ary.length; i++) {
            stringBuilder.append(ary[i]).append('\n');
        }
        System.out.println(stringBuilder);
    }
}
