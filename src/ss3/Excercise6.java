package ss3;

import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số xe:");
        String soXe = scanner.nextLine();

        int tongChuSo = 0;
        for (char c : soXe.toCharArray()) {
            tongChuSo += Character.getNumericValue(c);
        }
        int soNut = tongChuSo % 10;
        System.out.println("Số nút của biển số xe là: " + soNut);
    }
}