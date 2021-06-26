import java.util.Scanner;

public class NUM_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] ary = new int[9];
        for (int i = 0; i < ary.length; i++) {
            ary[i]=scanner.nextInt();
        }

        int max_index = 0;
        for (int i = 0; i < ary.length; i++) {
            if(ary[max_index]<ary[i]){
                max_index=i;
            }
        }
        System.out.println(ary[max_index]+"\n"+(max_index+1));
    }
}
