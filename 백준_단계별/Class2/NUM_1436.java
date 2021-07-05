import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUM_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int start = 666;
        while (true) {
            if (Integer.toString(start).contains("666")) {
                n--;
            }
            if (n == 0) {
                System.out.println(start);
                break;
            }
            start++;
        }
    }
}
