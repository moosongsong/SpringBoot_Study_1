import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUM_1874 {
    public static final int[] weight = new int[]{3, 5};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int min = 5000;
        for (int i = n / weight[1]; i >= 0; i--) {
            int temp = n;
            temp -= i * weight[1];
            if (temp % weight[0] == 0) {
                int result = i + temp / weight[0];
                if (result < min) {
                    min = result;
                }
            }
        }
        if (min == 5000) {
            System.out.println("-1");
        } else {
            System.out.println(min);
        }
    }
}
