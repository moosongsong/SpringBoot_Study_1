import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NUM_4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Triangle> arrayList = new ArrayList<>();
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            arrayList.add(new Triangle(a, b, c));
        }

        for (Triangle triangle : arrayList) {
            if (triangle.isNinety()) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }

    static class Triangle {
        int[] ary = new int[3];

        public Triangle(int a, int b, int c) {
            ary[0] = a;
            ary[1] = b;
            ary[2] = c;
        }

        public boolean isNinety() {
            Arrays.sort(ary);
            return ary[0] * ary[0] + ary[1] * ary[1] == ary[2] * ary[2];
        }
    }
}
