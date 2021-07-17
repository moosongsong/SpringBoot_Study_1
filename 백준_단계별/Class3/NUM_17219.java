import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NUM_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        HashMap<String, String> site = new HashMap<>();
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            site.put(stringTokenizer.nextToken(), stringTokenizer.nextToken());
        }
        for (int i = 0; i < m; i++) {
            String result = site.get(bufferedReader.readLine());
            bufferedWriter.write(result+"\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
