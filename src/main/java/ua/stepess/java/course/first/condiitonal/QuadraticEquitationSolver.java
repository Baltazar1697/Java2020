package ua.stepess.java.course.first.condiitonal;

/**
 * Should solve quadratic equitation like:
 * ax^2 + bx + c = 0
 * Class accepts value of coefficients a,b,c and returns array with roots.
 * You should return empty array in case if equitation haven't any roots.
 * In case of single root you should return array with this root and zeros.
 */
public class QuadraticEquitationSolver {

    public double[] solve(int a, int b, int c) {
        double[] result = new double[2];
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.println(discriminant);
        if (discriminant > 0) {
            double x1 = (Math.sqrt(discriminant) - b) / 2 * a;
            double x2 = (Math.sqrt(discriminant) + b) / 2 * a * (-1);
            result[0] = x1;
            result[1] = x2;
        } else if (discriminant == 0) {
            double x1 = (-1) * b / (2 * a);
            result[0] = x1;
            result[1] = 0;

        }
        return result;
    }

}
