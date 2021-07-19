import java.io.*;

public class NUM_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] remain100 = new int[]{25, 10, 5, 1};
        int testCase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testCase; i++) {
            int money = Integer.parseInt(bufferedReader.readLine());
            for (int remain : remain100) {
                bufferedWriter.write(money / remain + " ");
                money = money % remain;
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}