import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class NUM_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        HashMap<String, Integer> map = new HashMap<>();
        TreeSet<String> set = new TreeSet<>();
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), ".");
            stringTokenizer.nextToken();
            String temp = stringTokenizer.nextToken();
            if (set.contains(temp)){
                map.replace(temp, map.get(temp)+1);
            }else{
                map.put(temp, 1);
                set.add(temp);
            }
        }
        for(String str:set){
            bufferedWriter.write(str+" "+map.get(str)+"\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
