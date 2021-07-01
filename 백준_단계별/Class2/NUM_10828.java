import java.util.Scanner;
import java.util.Stack;

public class NUM_10828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int numberOfLine = scanner.nextInt();
        scanner.nextLine();

        String[] lines = new String[numberOfLine];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine().trim();
        }

        for (String line : lines) {
            int temp;
            if (line.equals("pop")) {
                if (stack.empty()) {
                    temp = -1;
                } else {
                    temp = stack.pop();
                }
            } else if (line.equals("size")) {
                temp = stack.size();
            } else if (line.equals("empty")) {
                if (stack.empty()) {
                    temp = 1;
                } else {
                    temp = 0;
                }
            } else if (line.equals("top")) {
                if (stack.empty()){
                    temp=-1;
                }else {
                    temp = stack.peek();
                }
            } else {
                String[] ary = line.split(" ");
                temp = Integer.parseInt(ary[1]);
                stack.add(temp);
                temp = -2;
            }
            if (temp !=-2){
                System.out.println(temp);
            }
        }
    }
}
