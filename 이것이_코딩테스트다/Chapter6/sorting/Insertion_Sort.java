package sorting;

public class Insertion_Sort {
    int[] array = new int[]{7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

    public void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

    public void printArray() {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
