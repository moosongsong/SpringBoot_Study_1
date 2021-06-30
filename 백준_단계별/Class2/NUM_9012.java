import java.util.Scanner;
import java.util.Stack;

public class NUM_9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();

        String[] ary = new String[num];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextLine();
        }

        for (String s : ary) {
            Stack<Character> stack = new Stack<>();
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                } else if (s.charAt(j) == ')') {
                    if (stack.empty()) {
                        System.out.println("NO");
                        flag = true;
                        break;
                    }
                    stack.pop();
                }
            }
            if (stack.empty() && !flag) {
                System.out.println("YES");
            } else if (!flag) {
                System.out.println("NO");
            }
        }


    }
}
