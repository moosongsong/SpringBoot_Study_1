import java.io.*;

public class NUM_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i < n + 1; i++) {
            String temp = bufferedReader.readLine();
            String[] ary = temp.split(" ");
            bufferedWriter.write("Case #" + i + ": ");
            for (int j = ary.length - 1; j >= 0; j--) {
                bufferedWriter.write(ary[j]+" ");
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
