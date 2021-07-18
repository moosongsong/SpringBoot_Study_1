import java.io.*;
import java.util.Arrays;
import java.util.TreeSet;

public class NUM_16499 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        TreeSet<String> names = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            char [] chars = bufferedReader.readLine().toCharArray();
            Arrays.sort(chars);
            String temp = new String(chars);
            names.add(temp);
        }

        bufferedWriter.write(String.valueOf(names.size()));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
