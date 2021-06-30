import java.util.Scanner;

public class NUM_2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCard = scanner.nextInt();
        int purpose = scanner.nextInt();
        int[] ary = new int[numOfCard];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
        }

        int nice = 0;
        for (int i = 0; i < ary.length - 2; i++) {
            for (int j = i + 1; j < ary.length - 1; j++) {
                for (int k = j + 1; k < ary.length; k++) {
                    int temp = ary[i] + ary[j] + ary[k];
                    if (nice < temp && temp <= purpose) {
                        nice = temp;
                    }
                }
            }
        }
        System.out.println(nice);
    }

}
