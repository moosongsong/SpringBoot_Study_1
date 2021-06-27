import java.util.Scanner;

public class NUM_2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ary = new int[8];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
        }

        int result;

        if (ary[0] == 8) {
            result = -1;
        } else if (ary[0] == 1) {
            result = 1;
        } else {
            result = 0;
        }

        for (int i = 1; i < ary.length; i++) {
            int temp = ary[i] - ary[i - 1];
            if (!((temp == -1) || (temp == 1))) {
                result = 0;
                break;
            }
        }

        String str = "";
        switch (result){
            case -1:
                str = "descending";
                break;
            case 1:
                str = "ascending";
                break;
            case 0:
                str = "mixed";
                break;
        }

        System.out.println(str);
    }
}
