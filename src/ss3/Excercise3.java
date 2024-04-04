package ss3;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");

        String tensanpham = scanner.nextLine();
        System.out.println("Nhap so luong: ");

        int soluong = scanner.nextInt();
        System.out.println("Nhap  gia: ");

        double gia = scanner.nextDouble();
        double tongtien = soluong * gia;
        double thue = tongtien * 0.1;

        System.out.println("Ten san pham: " + tensanpham);
        System.out.println("tong tien: " + tongtien);
        System.out.println("thueVAT: " + thue);
    }
}
