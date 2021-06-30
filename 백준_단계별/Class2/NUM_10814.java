import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class NUM_10814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            Person temp = new Person();
            temp.age = scanner.nextInt();
            temp.name = scanner.nextLine().trim();
            list.add(temp);
        }

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.age > o2.age) {
                    return 1;
                } else if (o1.age < o2.age) {
                    return -1;
                }
                return 0;
            }
        });

        for (Person person : list) {
            System.out.println(person);
        }
    }

    static class Person {
        int age;
        String name;
        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}
