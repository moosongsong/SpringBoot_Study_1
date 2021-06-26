import java.util.Scanner;

public class NUM_2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int num_3 = scanner.nextInt();
        int num_4 = scanner.nextInt();
        int num_5 = scanner.nextInt();
        System.out.println((num_1*num_1+num_2*num_2+
                num_3*num_3+num_4*num_4+num_5*num_5)%10);
    }
}
