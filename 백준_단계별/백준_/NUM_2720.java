import java.io.*;

public class NUM_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] remain100 = new int[]{25, 10, 5, 1};
        int testCase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testCase; i++) {
            int money = Integer.parseInt(bufferedReader.readLine());
            for (int j = 0; j < remain100.length; j++) {
                bufferedWriter.write(money/remain100[j]+" ");
                money = money%remain100[j];
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
