package ss3;

import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron: ");
        double r = scanner.nextDouble();
        double chuvi = 2 * r * Math.PI;
        double dientich = r * r * Math.PI;
        System.out.println("chu vi hinh tron la : " + chuvi);
        System.out.println("dien tich hinh tron la: " + dientich);
    }
}
