import java.util.Scanner;

public class NUM_10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        HotelForPerson[] ary = new HotelForPerson[row];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = new HotelForPerson();
            ary[i].H = scanner.nextInt();
            ary[i].W = scanner.nextInt();
            ary[i].N = scanner.nextInt();
        }

        for (HotelForPerson hotelForPerson : ary) {
            System.out.println(hotelForPerson.numOfYourRoom());
        }
    }

    static class HotelForPerson {
        int H;//layer
        int W;//room
        int N;

        public int numOfYourRoom() {
            int X, Y;
            if (N % H == 0) {
                Y = H * 100;
                X = N / H;
            } else {
                Y = (N % H) * 100;
                X = N / H + 1;
            }
            return Y + X;
        }
    }
}
