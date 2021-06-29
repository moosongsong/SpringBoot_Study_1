import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NUM_1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        String[] ary = new String[total];
        scanner.nextLine();
        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextLine();
        }

        Arrays.sort(ary, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        String before = "";
        for (String s : ary) {
            if (!s.equals(before)){
                System.out.println(s);
            }
            before = s;
        }
    }
}
