package ua.stepess.java.course.first.cycle;

/**
 * Should sum all elements of the massive
 */
public class MyAwesomeSumator {

    public int sum(int[] nums) {
        int rez = 0;
        for (int num : nums) {
            rez += num;
        }
        return rez;
    }

}
