import java.util.Arrays;
import java.util.Scanner;

public class NUM_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int[] index = new int['z' - 'a' + 1];
        Arrays.fill(index, -1);
        for (int i = 0; i < a.length(); i++) {
            char temp = a.charAt(i);
            if (index[temp - 'a'] == -1) {
                index[temp - 'a'] = i;
            }
        }
        for (int j : index) {
            System.out.print(j+" ");
        }
    }
}
