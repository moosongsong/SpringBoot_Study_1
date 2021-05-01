import sorting.Insertion_Sort;
import sorting.Quick_Sort;
import sorting.Selection_Sort;

public class Chapter6_Main {
    public static void main(String[] args) {
//        Selection_Sort sort = new Selection_Sort();
//        sort.sort();
//        sort.printArray();

//        Insertion_Sort sort = new Insertion_Sort();
//        sort.sort();
//        sort.printArray();

        Quick_Sort sort = new Quick_Sort();
        sort.sort();
        sort.printArray();
    }
}
