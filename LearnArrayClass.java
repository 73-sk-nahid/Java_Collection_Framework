
import java.util.Arrays;

public class LearnArrayClass {

    public static void main(String[] args) {
        int array[] = {4, 6, 2, 7, 1, 8, 5, 9, 3};

        Arrays.sort(array);
        for (int i : array) {
            System.out.println(i + " ");
        }

        /*we are sorting the array first because binarySearch working on sorted array only */
        int index = Arrays.binarySearch(array, 4);  //search the index of 4
        System.out.println("Index of 4 is: " + index);

        Arrays.fill(array, 0);
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
