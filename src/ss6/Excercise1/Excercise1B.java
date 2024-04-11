package ss6.Excercise1;
/*
a.    Viết phương thức đổi một ký tự hoa sang ký tự thường.
*/

import java.util.Scanner;

public class Excercise1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập he so a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập he so b: ");
        double b = scanner.nextDouble();

        System.out.println("ket qua phuong trinh bac nhat: ");
        levelOne(a, b);
    }

    static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co nghiem duy nhat: " + -b / a);
        }
    }


}
