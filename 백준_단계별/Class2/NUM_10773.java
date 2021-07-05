import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NUM_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Stack<Integer>stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            if (!stack.isEmpty() && temp ==0){
                stack.pop();
            }else{
                stack.add(temp);
            }
        }

        int result =0;
        while (!stack.isEmpty()){
            result+=stack.pop();
        }
        System.out.println(result);
    }
}
