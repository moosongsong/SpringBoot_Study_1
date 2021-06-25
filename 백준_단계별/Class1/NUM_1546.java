import java.util.Scanner;

public class NUM_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int[] score = new int[total];

        int max = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
            if (max < score[i]) {
                max = score[i];
            }
        }

        double temp = 0;
        for (int i = 0; i < score.length; i++) {
            temp += (double) score[i] / max * 100;
        }

        System.out.println(temp / (double) total);
    }
}
