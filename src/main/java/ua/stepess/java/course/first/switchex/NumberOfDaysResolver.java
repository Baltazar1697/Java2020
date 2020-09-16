package ua.stepess.java.course.first.switchex;



/**
 * Write a Java program to find the number of days in a month.
 */
public class NumberOfDaysResolver {

    public int resolve(int month, int year) {
        int days = 0;
        int months31[] = new int[]{1, 3, 5, 7, 8, 10, 12};
        int months30[] = new int[]{4, 6, 9, 11, 0, 0, 0};
        if (year % 4 == 0) {
            days = 29;
        } else {
            days = 28;
        }
        for (int i = 0; i < 7; i++) {
            if(months31[i] == month){
                days = 31;
            }else if(months30[i] == month){
                days = 30;
                break;
            }
        }
            return days;
        }
    }


