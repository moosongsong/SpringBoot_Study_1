import java.util.Scanner;

public class NUM_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        int result = 0;
        for (int i = 0; i < count; i++) {
            result += str.charAt(i) - '0';
        }

        System.out.println(result);
    }
}
