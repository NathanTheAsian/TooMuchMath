/**
 * TooMuchMath.java
 *
 * A custom math utility library that provides extended mathematical
 * functions and constants — for when you just need *too much math*.
 *
 * Author: Nathan Ng/Julian Chan
 * Created: October 2025
 */

public class TooMuchMath {

    // =============================
    // Constants
    // =============================

    /** The mathematical constant pi (π). */
    public static final double PI = 3.141592653589793;

    /** The mathematical constant e (Euler's number). */
    public static final double E = 2.718281828459045;


    // =============================
    // Basic Arithmetic Operations
    // =============================

    /**
     * Returns the factorial of a non-negative integer n.
     * @param n the integer
     * @return n! (factorial of n)
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative.");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Computes the power of a base raised to an exponent.
     * @param base the base number
     * @param exp the exponent
     * @return base^exp
     */
    public static double pow(double base, int exp) {
        double result = 1.0;
        for (int i = 0; i < Math.abs(exp); i++) {
            result *= base;
        }
        return exp < 0 ? 1 / result : result;
    }

    /**
     * Returns the greatest common divisor (GCD) of two integers.
     * @param a first integer
     * @param b second integer
     * @return GCD of a and b
     */
    public static int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    /**
     * Returns the least common multiple (LCM) of two integers.
     * @param a first integer
     * @param b second integer
     * @return LCM of a and b
     */
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }


    // =============================
    // Utility Methods
    // =============================

    /**
     * Checks if a number is prime.
     * @param n the number to check
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    /**
     * Returns the absolute value of a number.
     * @param x the number
     * @return |x|
     */
    public static double abs(double x) {
        return x < 0 ? -x : x;
    }

    // =============================
    // Example Main (for Testing)
    // =============================

    public static void main(String[] args) {
        // System.out.println("=== TooMuchMath Demo ===");
        // System.out.println("PI = " + PI);
        // System.out.println("E = " + E);
        // System.out.println("Factorial(5) = " + factorial(5));
        // System.out.println("2^3 = " + pow(2, 3));
        // System.out.println("GCD(48, 18) = " + gcd(48, 18));
        // System.out.println("LCM(4, 6) = " + lcm(4, 6));
        // System.out.println("Is 17 prime? " + isPrime(17));
        // System.out.println("|-3.7| = " + abs(-3.7));
        function f1 = new function("x^2 +10x -20");
        System.out.println(f1);
    }

}
