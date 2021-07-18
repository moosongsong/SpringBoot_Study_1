import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class NUM_2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int testCase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testCase; i++) {
            HashSet<Integer> set = new HashSet<>();
            int numOfFirst = Integer.parseInt(bufferedReader.readLine());
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < numOfFirst; j++) {
                set.add(Integer.parseInt(stringTokenizer.nextToken()));
            }
            int numOfSecond = Integer.parseInt(bufferedReader.readLine());
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < numOfSecond; j++) {
                if (set.contains(Integer.parseInt(stringTokenizer.nextToken()))){
                    bufferedWriter.write("1\n");
                }else{
                    bufferedWriter.write("0\n");
                }
            }
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
