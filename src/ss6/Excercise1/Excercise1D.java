package ss6.Excercise1;
/*
d. Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên
*/

import java.util.Scanner;

public class Excercise1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyen thứ nhất: ");
        int a = scanner.nextInt();

        System.out.println("Nhập số nguyen thứ hai: ");
        int b = scanner.nextInt();

        System.out.println("Nhập số nguyen thứ ba: ");
        int c = scanner.nextInt();

        System.out.println("Nhập số nguyen thứ tu: ");
        int d = scanner.nextInt();

        int min = min(a, b, c, d);
        System.out.println("Giá trị nhỏ nhất trong 4 số là: " + min);
    }

    static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);

        return min;
    }
}
