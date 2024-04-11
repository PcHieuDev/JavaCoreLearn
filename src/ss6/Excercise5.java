package ss6;
/*
Phương thức in ra n phần tử của dãy Fibonacy.
*/

import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của dãy Fibonacy: ");
        int n = scanner.nextInt();

        System.out.println("Dãy Fibonacy: ");
        fibonacy(n);
    }

    static void fibonacy(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(fn + "\t");

            f0 = f1;
            f1 = fn;

            fn = f0 + f1;
        }
    }


}
