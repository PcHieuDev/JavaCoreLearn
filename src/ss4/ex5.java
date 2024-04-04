package ss4;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a va b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.print("Phuong trinh vo so nghiem");
            } else {
                System.out.print("Phuong trinh vo nghiem");
            }

        } else {
            double x = -(b * 1.0 / a);
            System.out.print("Phuong trinh co nghiem la x = : " + x);
        }
    }
}
