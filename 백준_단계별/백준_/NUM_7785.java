import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class NUM_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        TreeSet<String> employees = new TreeSet<>((o1, o2) -> -o1.compareTo(o2));
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            String name = stringTokenizer.nextToken();
            String state = stringTokenizer.nextToken();
            if (state.equals("enter")){
                employees.add(name);
            }else if(state.equals("leave")){
                employees.remove(name);
            }
        }
        for(String name:employees){
            bufferedWriter.write(name+"\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
