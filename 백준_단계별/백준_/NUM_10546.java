import java.io.*;
import java.util.HashMap;

public class NUM_10546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        HashMap<String, Integer> people = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String temp = bufferedReader.readLine();
            try {
                if (people.get(temp) >= 1) {
                    people.replace(temp, people.get(temp) + 1);
                }
            }catch (NullPointerException e){
                people.put(temp, 1);
            }
        }
        for (int i = 0; i < n - 1; i++) {
            String temp = bufferedReader.readLine();
            if (people.get(temp) > 1) {
                people.replace(temp, people.get(temp) - 1);
            } else {
                people.remove(temp);
            }
        }
        for (String str : people.keySet()) {
            bufferedWriter.write(str);
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
