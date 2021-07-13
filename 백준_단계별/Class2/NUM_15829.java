import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUM_15829 {
    static final int r = 31;
    static final int m = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(bufferedReader.readLine().trim());
        String str = bufferedReader.readLine().trim();

        long result = 0;
        for (int i = 0; i < l; i++) {
            result += ((int) str.charAt(i) - 'a' + 1) * pow(r, i);
        }
        System.out.println(result % m);
    }

    static long pow(int a, int b) {
        return b == 0 ? 1 : a * pow(a, b - 1) % m;
    }
}
