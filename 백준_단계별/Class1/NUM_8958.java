import java.util.Scanner;

public class NUM_8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        String [] questions = new String[total];
        scanner.nextLine();
        for (int i = 0; i < questions.length; i++) {
            questions[i] = scanner.nextLine();
        }

        int max;
        int [] score = new int[total];

        for (int i = 0; i < questions.length; i++) {
            max=0;
            for (int j = 0; j < questions[i].length(); j++) {
                if (questions[i].charAt(j)=='O'){
                    max++;
                    score[i]+=max;
                }else{
                    max=0;
                }
            }
        }

        for (int j : score) {
            System.out.println(j);
        }
    }
}
