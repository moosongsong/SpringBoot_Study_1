import java.util.ArrayList;
import java.util.Scanner;

public class NUM_1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ary = new ArrayList<>();
        while(true){
            String temp = scanner.nextLine();
            if (temp.equals("0")){
                break;
            }else{
                ary.add(temp);
            }
        }
        for (String str : ary) {
            boolean isSame = true;
            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
