package ss4;

import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a, b va c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == 0){
            // lam nhu bac 1
            if (b == 0){
                if (c == 0){
                    System.out.print("Phuong trinh vo so nghiem");
                } else {
                    System.out.print("Phuong trinh vo nghiem");
                }
            } else {
                double x = -(c * 1.0 / b);
                System.out.print("Phuong trinh co nghiem la x = : " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            // check delta
            if(delta < 0){
                System.out.print("Phuong trinh vo nghiem");
            } else if ( delta == 0){
                double x = -b / (2 * a);
                System.out.print("Phuong trinh co nghiem kep x = : " + x);
            } else {
                double x1 = ( -b - Math.sqrt(delta) ) / (2 * a);
                double x2 = ( -b + Math.sqrt(delta) ) / (2 * a);
                System.out.print("Phuong trinh co 2 nghiem phan biet x1 = : " + x1 + " va x2 = : " + x2);
            }

        }
    }
}
