package ss6;
/*Phương thức nhận vào một số nguyên dương n và thực hiện
        a.    Trả về số đảo của số đó.
        b.    Có phải là số đối xứng (Trả về True/False)
        c.    Có phải là số chính phương.
        d.    Có phải là số nguyên tố.
        e.    Tổng các chữ số lẻ.
        f.    Tổng các chữ số nguyên tố.
        g.    Tổng các chữ số chính phương.*/
import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // a. trả về số đảo của số đó.
        System.out.println("Số đảo của " + n + " là: " + reverseNumber(n));

        // b. Có phải là số đối xứng (Trả về True/False)
        if (isSymmetryNumber(n)) {
            System.out.println(n + " là số đối xứng");
        } else {
            System.out.println(n + " không phải là số đối xứng");
        }

        // c. Có phải là số chính phương.
        if (isSquareNumber(n)) {
            System.out.println(n + " là số chính phương");
        } else {
            System.out.println(n + " không phải là số chính phương");
        }

        // d. Có phải là số nguyên tố.
        if (isPrimeNumber(n)) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }

        System.out.println("Tổng các chữ số lẻ của " + n + " là: " + calculateTotalOddDigits(n));
        System.out.println("Tổng các chữ số nguyên tố của " + n + " là: " + calculateTotalPrimeDigits(n));
        System.out.println("Tổng các chữ số chính phương của " + n + " là: " + calculateTotalSquareDigits(n));
    }

    // a. Trả về số đảo của số đó.
    static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }

    // b. Có phải là số đối xứng (Trả về True/False)
    static boolean isSymmetryNumber(int number) {
        return number == reverseNumber(number);
    }

    // c. Có phải là số chính phương.
    static boolean isSquareNumber(int number) {
        return Math.sqrt(number) == (int) Math.sqrt(number);
    }

    // d. Có phải là số nguyên tố.
    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // e. Tổng các chữ số lẻ.
    static int calculateTotalOddDigits(int number) {
        int total = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                total += digit;
            }
            number /= 10;
        }
        return total;
    }

    // f. Tổng các chữ số nguyên tố.
    static int calculateTotalPrimeDigits(int number) {
        int total = 0;
        while (number != 0) {
            int digit = number % 10;
            if (isPrimeNumber(digit)) {
                total += digit;
            }
            number /= 10;
        }
        return total;
    }

    // g. Tổng các chữ số chính phương.
    static int calculateTotalSquareDigits(int number) {
        int total = 0;
        while (number != 0) {
            int digit = number % 10;
            if (isSquareNumber(digit)) {
                total += digit;
            }
            number /= 10;
        }
        return total;
    }
}
