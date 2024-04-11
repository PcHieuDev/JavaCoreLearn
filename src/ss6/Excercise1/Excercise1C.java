package ss6.Excercise1;
/*
c. Viết phương thức giải phương trình bậc hai
*/

import java.util.Scanner;

public class Excercise1C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập he so a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập he so b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập he so c: ");
        double c = scanner.nextDouble();

        levelTwo(a, b, c);
    }

    static void levelTwo(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh vo vo nghiem");
                } else {
                    System.out.println("phuong trinh vo nghiem");
                }
            } else {
                System.out.println("phuong trinh co nghiem duy nhat: " + -c / b);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("phuong trinh co nghiem kep: " + -b / (2 * a));
            } else {
                System.out.println("phuong trinh co 2 nghiem phan biet: ");
                System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
            }
        }
    }
}
    

