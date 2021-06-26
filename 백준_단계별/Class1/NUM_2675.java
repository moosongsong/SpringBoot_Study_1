import java.util.Scanner;

public class NUM_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] count = new int [n];
        String [] str = new String[n];

        for (int i = 0; i < n; i++) {
            count[i]=scanner.nextInt();
            str[i] = scanner.nextLine().trim();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                for (int k = 0; k < count[i]; k++) {
                    System.out.print(str[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
