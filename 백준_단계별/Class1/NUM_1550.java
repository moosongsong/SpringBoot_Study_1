import java.util.Scanner;

public class NUM_1550 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int num;
            char temp = str.charAt(i);
            switch (temp) {
                case 'A':
                    num = 10;
                    break;
                case 'B':
                    num = 11;
                    break;
                case 'C':
                    num = 12;
                    break;
                case 'D':
                    num = 13;
                    break;
                case 'E':
                    num = 14;
                    break;
                case 'F':
                    num = 15;
                    break;
                default:
                    num = str.charAt(i) - '0';
                    break;
            }

            result += num;
            if (i == str.length() - 1) {
                break;
            }
            result = result << 4;
        }
        System.out.println(result);
    }
}
