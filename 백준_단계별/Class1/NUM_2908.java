import java.util.Scanner;

public class NUM_2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String[] str = temp.split(" ");

        int result = 0;
        for (int i = str[0].length() - 1; i >= 0; i--) {
            if (str[0].charAt(i) > str[1].charAt(i)) {
                break;
            } else if (str[0].charAt(i) < str[1].charAt(i)) {
                result = 1;
                break;
            }
        }

        for (int i = str[result].length() - 1; i >= 0; i--) {
            System.out.print(str[result].charAt(i));
        }
    }
}