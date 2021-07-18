import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUM_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        Queue<Integer> queue = new LinkedList<>();
        int testCase = Integer.parseInt(bufferedReader.readLine());
        int last =0;
        for (int i = 0; i < testCase; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            String instruction = stringTokenizer.nextToken();
            if (instruction.equals("push")){
                last = Integer.parseInt(stringTokenizer.nextToken());
                queue.add(last);
            }else if(instruction.equals("pop")){
                if (queue.isEmpty()){
                    bufferedWriter.write("-1\n");
                }else{
                    bufferedWriter.write(queue.poll()+"\n");
                }
            }else if(instruction.equals("size")){
                bufferedWriter.write(queue.size()+"\n");
            }else if(instruction.equals("empty")){
                if (queue.isEmpty()){
                    bufferedWriter.write("1\n");
                }else{
                    bufferedWriter.write("0\n");
                }
            }else if(instruction.equals("front")){
                if (queue.isEmpty()){
                    bufferedWriter.write("-1\n");
                }else{
                    bufferedWriter.write(queue.peek()+"\n");
                }
            }else if(instruction.equals("back")){
                if (queue.isEmpty()){
                    bufferedWriter.write("-1\n");
                }else{
                    bufferedWriter.write(last+"\n");
                }
            }
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
