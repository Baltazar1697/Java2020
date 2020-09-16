package ua.stepess.java.course.first.cycle;

/**
 * should find sum of first N odd numbers:
 * <p>
 * Input number of terms is: 5
 * <p>
 * The odd numbers are :
 * 1
 * 3
 * 5
 * 7
 * 9
 * <p>
 * The Sum of odd Natural Number upto 5 terms is: 25
 */
public class LimitedOddNumbersSumator {

    public int sum(int limit) {
        int result = 0, counter, i = 0;
        for (counter = 0; counter < limit; i++) {
            if (i % 2 == 1) {
                result += i;
                System.out.println(result);
                counter++;
            }
        }
        return result;
    }

}
