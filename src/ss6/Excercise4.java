package ss6;
/*
Phương thức trả về uoc chung lon nhat của 2 số nguyên.
*/

import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        System.out.printf("Ước chung lớn nhất của %d và %d là: %d%n", a, b, uocChungLonNhat(a, b));
    }

    static int uocChungLonNhat(int a, int b) {
        // lay gia tri tuyet doi
        a = Math.abs(a);
        b = Math.abs(b);

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        if (max % min == 0) {
            return min;
        }
        for (int i = min / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
