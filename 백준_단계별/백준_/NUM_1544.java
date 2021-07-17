import java.io.*;
import java.util.HashSet;

public class NUM_1544 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        HashSet<String> set = new HashSet<>();
        set.add(bufferedReader.readLine());
        for (int i = 0; i < n - 1; i++) {
            String temp = bufferedReader.readLine();
            if (!check(set, temp)) {
                set.add(temp);
            }
        }
        bufferedWriter.write(String.valueOf(set.size()));
        bufferedReader.close();
        bufferedWriter.close();
    }

    static boolean check(HashSet<String> set, String temp) {
        StringBuilder stringBuilder;
        for (String str : set) {
            stringBuilder = new StringBuilder(str);
            for (int i = 0; i < temp.length(); i++) {
                if (temp.equals(stringBuilder.toString())) {
                    return true;
                } else {
                    stringBuilder.append(stringBuilder.charAt(0)).deleteCharAt(0);
                }
            }
        }
        return false;
    }
}
