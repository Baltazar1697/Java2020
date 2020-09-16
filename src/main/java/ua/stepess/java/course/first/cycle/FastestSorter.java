package ua.stepess.java.course.first.cycle;

/**
 * Implement whatever Sort algorithm you want.
 * You should sort array in ascending order.
 */
public class FastestSorter {

    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }

}
