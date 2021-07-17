import java.io.*;
import java.util.Stack;

public class NUM_20001 {
    static final int PROBLEM = 1;
    public static void main(String[] args) throws IOException {
        boolean flag = false;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        String temp = bufferedReader.readLine();
        if (temp.equals("고무오리 디버깅 시작")){
            flag = true;
        }
        while (flag){
            temp = bufferedReader.readLine();
            if (temp.equals("고무오리 디버깅 끝")){
                flag = false;
            }else if (temp.equals("문제")){
                stack.add(PROBLEM);
            }else if (temp.equals("고무오리")){
                if (stack.empty()){
                    stack.add(PROBLEM);
                    stack.add(PROBLEM);
                }else{
                    stack.pop();
                }
            }
        }
        if (stack.empty()){
            bufferedWriter.write("고무오리야 사랑해");
        }else{
            bufferedWriter.write("힝구");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
