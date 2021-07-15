import java.util.Scanner;

public class NUM_1924 {
    public static void main(String[] args) {
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int totalDate = scanner.nextInt();
        for (int i = 1; i < x; i++) {
            totalDate += month[i];
        }
        System.out.println(day[totalDate % 7]);
    }
}
