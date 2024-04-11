package ss5;

import java.util.Scanner;

/**
 * In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
 * /
 */
public class Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
