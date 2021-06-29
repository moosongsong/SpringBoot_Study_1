import java.util.Scanner;

public class NUM_1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean[][] board = new boolean[n][m];
        scanner.nextLine();
        for (int i = 0; i < board.length; i++) {
            String temp = scanner.nextLine().trim();
            for (int j = 0; j < m; j++) {
                board[i][j] = temp.charAt(j) == 'B';
            }
        }

        int min = 64;

        for (int i = 0; i < (board.length - 7); i++) {
            for (int j = 0; j < (board[i].length - 7); j++) {
                int count = 0;
                boolean stand = board[i][j];
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (board[i + k][j + l] != stand)
                            count++;
                        stand = (!stand);
                    }
                    stand = (!stand);
                }
                count = Math.min(count, 64 - count);
                min = Math.min(min, count);
            }
        }

        System.out.println(min);
    }
}
