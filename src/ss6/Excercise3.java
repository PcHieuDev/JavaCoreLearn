package ss6;

/*Phương thức nhận vào một số nguyên dương n và thực hiện:
a.    S = 1 + 2 + … + n
b.    S = 1^2 + 2^2 + … + n^2
c.    S = 1 + 1/2 + … + 1/n
d.    S = 1 * 2 * … * n
e.    S = 1! + 2! + … + n!*/

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // a.    S = 1 + 2 + … + n
        System.out.println("S = 1 + 2 + … + n = " + sumAtoN(n));

        // b.    S = 1^2 + 2^2 + … + n^2
        System.out.println("S = 1^2 + 2^2 + … + n^2 = " + sumSquareAtoN(n));

        // c.    S = 1 + 1/2 + … + 1/n
        System.out.println("S = 1 + 1/2 + … + 1/n = " + sumFractionAtoN(n));

        // d.    S = 1 * 2 * … * n
        System.out.println("S = 1 * 2 * … * n = " + multiplyAtoN(n));

        // e.    S = 1! + 2! + … + n!
        System.out.println("S = 1! + 2! + … + n! = " + sumFactorialAtoN(n));

    }

    // a.    S = 1 + 2 + … + n
    static int sumAtoN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // b.    S = 1^2 + 2^2 + … + n^2
    static int sumSquareAtoN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    // c.    S = 1 + 1/2 + … + 1/n
    static double sumFractionAtoN(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // d.    S = 1 * 2 * … * n
    static int multiplyAtoN(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    // e.    S = 1! + 2! + … + n!
    static long sumFactorialAtoN(int n) {
        long sum = 0;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }


}
