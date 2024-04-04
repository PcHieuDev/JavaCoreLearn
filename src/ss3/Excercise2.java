package ss3;

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;

        System.out.println("Tong cua a va b la: " + tong);
        System.out.println("Hieu cua a va b la: " + hieu);
        System.out.println("Tich cua a va b la: " + tich);
        System.out.println("Thuong cua a va b la: " + thuong);

    }
}
